package com.example.getapi.presentetion

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.widget.SearchView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.getapi.NetworkAvailable
import com.example.getapi.presentetion.di.Injector
import com.example.getapi.data.Model.LiveMatch.MatchLiveData

import com.example.getapi.databinding.FragmentMainBinding
import javax.inject.Inject

class MainFragment : Fragment() {
    @Inject
    lateinit var factory: MyViewModelFactor
    private var _binding: FragmentMainBinding? = null
    private val originalList = mutableListOf<MatchLiveData>()
    private val filteredList = mutableListOf<MatchLiveData>()
    private val searchQueryLiveData = MutableLiveData<String>()
    private val binding get() = _binding!!
    private lateinit var matchViewModel: MyViewModel

    private lateinit var adapter: MainAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {

        _binding = FragmentMainBinding.inflate(inflater, container, false)

        return binding.root

    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (requireActivity().application as Injector).createMatchSubComponent().inject(this)




        matchViewModel = ViewModelProvider(this, factory)[MyViewModel::class.java]
        if (NetworkAvailable(requireContext()).isNetworkAvailable()) {
            initRecyclerView()
        } else {

            binding.noInternet.visibility = View.VISIBLE
            binding.recyclerViewhome.visibility = View.GONE
            Toast.makeText(
                requireContext(),
                "No internet connection available.",
                Toast.LENGTH_SHORT
            ).show()

        }

        binding.searchBar.setOnQueryTextListener(object : SearchView.OnQueryTextListener {



            override fun onQueryTextSubmit(query: String?): Boolean {
                // Implement the functionality for when the user submits the query
                return true
            }

            @SuppressLint("NotifyDataSetChanged")
            override fun onQueryTextChange(newText: String?): Boolean {
                filterData(newText)
                adapter.setList(filteredList)
                adapter.notifyDataSetChanged()
                return true
            }


        })
        searchQueryLiveData.observe(viewLifecycleOwner) { query ->
            filterData(query)
            adapter.setList(filteredList)
            adapter.notifyDataSetChanged()
        }
    }

    private fun initRecyclerView() {
        binding.recyclerViewhome.layoutManager = LinearLayoutManager(requireContext())
        adapter = MainAdapter()
        binding.recyclerViewhome.adapter = adapter
        adapter.setList(filteredList)
        displayPopularMovie()


    }

    @SuppressLint("NotifyDataSetChanged")
    private fun displayPopularMovie() {
        binding.progressBar.visibility = View.VISIBLE
        val responseLiveData = matchViewModel.getMatch()
        responseLiveData.observe(viewLifecycleOwner) {

            if (it != null) {
                originalList.clear()
                originalList.addAll(it)
                filterData("") // Apply initial filtering with an empty query
                adapter.setList(filteredList)
                adapter.notifyDataSetChanged()
                binding.progressBar.visibility = View.GONE

            } else {
                binding.progressBar.visibility = View.GONE
                Toast.makeText(requireContext(), "No Data Available", Toast.LENGTH_LONG).show()


            }

        }


    }




    override fun onDestroy() {
        super.onDestroy()
        _binding == null
    }

    private fun filterData(query: String?) {
        filteredList.clear()
        if (!query.isNullOrEmpty()) {
            val searchQuery = query.lowercase()
            for (item in originalList) {
                if (item.League.lowercase().contains(searchQuery)||item.Away_Team.lowercase().contains(searchQuery)||item.Home_Team.lowercase().contains(searchQuery)) {
                    filteredList.add(item)
                }
            }
        } else {
            filteredList.addAll(originalList)
        }
    }
}