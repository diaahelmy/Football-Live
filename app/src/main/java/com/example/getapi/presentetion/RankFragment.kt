package com.example.getapi.presentetion


import android.annotation.SuppressLint
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.getapi.presentetion.di.Injector
import com.example.getapi.databinding.FragmentRnakBinding
import javax.inject.Inject


class RankFragment : Fragment() {
    @Inject
    lateinit var factory: MyViewModelFactor
    private var _binding: FragmentRnakBinding? = null
    private val args: RankFragmentArgs by navArgs()

    private val binding get() = _binding!!
    private lateinit var matchViewModel: MyViewModel
    private lateinit var adapter: RankAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {

        _binding = FragmentRnakBinding.inflate(inflater, container, false)
        return binding.root
    }
    companion object {
        fun newInstance(leagueId: Int): RankFragment {
            val fragment = RankFragment()
            val args = Bundle()
            args.putInt("leagueId", leagueId)
            fragment.arguments = args
            return fragment
        }
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val match = args.leagueId

        (requireActivity().application as Injector).createMatchSubComponent().injectRank(this)

        matchViewModel = ViewModelProvider(this, factory)[MyViewModel::class.java]
        if (isNetworkAvailable()) {

            Log.d("diaa", match.toString())


            initRecyclerView(match.toString())
        } else {
            binding.noInternet.visibility = View.VISIBLE
            binding.recyclerViewhome.visibility = View.GONE
            Toast.makeText(
                requireContext(),
                "No internet connection available.",
                Toast.LENGTH_SHORT
            ).show()

        }

    }

    private fun initRecyclerView(id: String) {
        binding.recyclerViewhome.layoutManager = LinearLayoutManager(requireContext())
        adapter = RankAdapter()
        binding.recyclerViewhome.adapter = adapter
        displayMatchRank(id)
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun displayMatchRank(id: String) {
        binding.progressBar.visibility = View.VISIBLE
        val responseLiveData = matchViewModel.getRank(id)
        responseLiveData.observe(viewLifecycleOwner) {
            if (it != null) {
                adapter.setList(it)
                adapter.notifyDataSetChanged()
                binding.progressBar.visibility = View.GONE
                binding.recyclerViewhome.visibility=View.VISIBLE
            } else {
                binding.progressBar.visibility = View.GONE
                Toast.makeText(requireContext(), "No Data Available", Toast.LENGTH_LONG).show()


            }

        }


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