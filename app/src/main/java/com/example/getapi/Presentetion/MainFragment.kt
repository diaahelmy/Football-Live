package com.example.getapi.Presentetion

import android.annotation.SuppressLint
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.getapi.Presentetion.di.Injector
import com.example.getapi.databinding.FragmentMainBinding
import javax.inject.Inject

class MainFragment : Fragment() {
    @Inject
    lateinit var factory: MyViewModelFactor
    private var _binding: FragmentMainBinding? = null

    private val binding get() = _binding!!
    private lateinit var matchViewModel: MyViewModel
    private lateinit var adapter: MatchAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {

        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (requireActivity().application as Injector).createMatchSubComponent().inject(this)




        matchViewModel = ViewModelProvider(this, factory)[MyViewModel::class.java]
        if (isNetworkAvailable()) {
            initRecyclerView()
        } else {

            binding.noInternet.visibility = View.VISIBLE
            binding.recyclerView.visibility = View.GONE
            Toast.makeText(
                requireContext(),
                "No internet connection available.",
                Toast.LENGTH_SHORT
            ).show()

        }


    }

    private fun initRecyclerView() {


        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        adapter = MatchAdapter(matchViewModel)

        binding.recyclerView.adapter = adapter

        displayPopularMovie()


    }

    @SuppressLint("NotifyDataSetChanged")
    private fun displayPopularMovie() {
        binding.progressBar.visibility = View.VISIBLE
        val responseLiveData = matchViewModel.getMatch()
        responseLiveData.observe(viewLifecycleOwner, Observer {

            if (it != null) {
                adapter.setList(it)
                adapter.notifyDataSetChanged()
                binding.progressBar.visibility = View.GONE

            } else {
                binding.progressBar.visibility = View.GONE
                Toast.makeText(requireContext(), "No Data Available", Toast.LENGTH_LONG).show()


            }

        })


    }


    private fun isNetworkAvailable(): Boolean {
        val connectivityManager =
            requireContext().getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        val activeNetwork = connectivityManager.activeNetwork ?: return false
        val networkCapabilities =
            connectivityManager.getNetworkCapabilities(activeNetwork) ?: return false

        return when {
            networkCapabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true
            networkCapabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true
            networkCapabilities.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> true
            else -> false
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding == null
    }


}