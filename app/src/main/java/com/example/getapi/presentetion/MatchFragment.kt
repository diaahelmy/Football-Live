package com.example.getapi.presentetion


import android.annotation.SuppressLint
import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.getapi.Logo

import com.example.getapi.databinding.FragmentMatchBinding
import com.example.getapi.presentetion.di.Injector
import javax.inject.Inject


class MatchFragment : Fragment() {
    @Inject
    lateinit var factory: MyViewModelFactor
    private var _binding: FragmentMatchBinding? = null
    private var matchViewModel: MyViewModel? = null
    private lateinit var adapterHome:MatchHomeAdapter
    private lateinit var adapterAway: MatchAwayAdapter

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentMatchBinding.inflate(inflater, container, false)


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
        (requireActivity().application as Injector).createMatchSubComponent().injectdata(this)

        matchViewModel = ViewModelProvider(this, factory)[MyViewModel::class.java]

        binding.scoreViewModel = matchViewModel
        binding.lifecycleOwner = viewLifecycleOwner
        val arguments = arguments ?: return // Handle null arguments

        val match = MatchFragmentArgs.fromBundle(arguments).matchid
        binding.apply {
            matchViewModel!!.fetchData(match)

            match.Match_ID
//            tAwayScore.text = match.Away_Score.toString()
//
//            tHomeScore.text = match.Home_Score.toString()
            tAwayTeam.text = match.Away_Team
            tHomeTeam.text = match.Home_Team
            time.text = match.Status
            leagname.text = match.League


            val awayLogoId = Logo().getLogoId(match.Away_Team)
            val homeLogoId = Logo().getLogoId(match.Home_Team)
            logoalHilal.setImageResource(awayLogoId)
            logoalHilalhome.setImageResource(homeLogoId)
            logoalHilal.setOnClickListener {
                val action =
                    MatchFragmentDirections.actionMatchFragmentToRnakFragment(match.League_ID)
                it.findNavController().navigate(action)
            }

            logoalHilalhome.setOnClickListener {
                val action =
                    MatchFragmentDirections.actionMatchFragmentToRnakFragment(match.League_ID)
                it.findNavController().navigate(action)
            }
        }
        initRecyclerViewHome(match.Match_ID)
        initRecyclerViewAway(match.Match_ID)
    }

    private fun initRecyclerViewHome(id: String) {
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        adapterHome = MatchHomeAdapter()
        binding.recyclerView.adapter = adapterHome
        displayMatchHome(id)
    }
    private fun initRecyclerViewAway(id: String) {
        binding.recyclerViewaway.layoutManager = LinearLayoutManager(requireContext())
        adapterAway = MatchAwayAdapter()
        binding.recyclerViewaway.adapter = adapterAway
        displayMatchAway(id)
    }
    @SuppressLint("NotifyDataSetChanged")
    private fun displayMatchAway(id: String) {
        binding.progressBar.visibility = View.VISIBLE
        val responseLiveData = matchViewModel?.getLineups(id)
        responseLiveData?.observe(viewLifecycleOwner, Observer {
            if (it != null) {
                adapterAway.setList(it)
                adapterAway.notifyDataSetChanged()
                binding.progressBar.visibility = View.GONE
                binding.recyclerViewaway.visibility=View.VISIBLE
            } else {
                binding.progressBar.visibility = View.GONE
                Toast.makeText(requireContext(), "No Data Available", Toast.LENGTH_LONG).show()


            }

        })


    }
    @SuppressLint("NotifyDataSetChanged")
    private fun displayMatchHome(id: String) {
        binding.progressBar.visibility = View.VISIBLE
        val responseLiveData = matchViewModel?.getLineups(id)
        responseLiveData?.observe(viewLifecycleOwner, Observer {
            if (it != null) {
                adapterHome.setList(it)
                adapterHome.notifyDataSetChanged()
                binding.progressBar.visibility = View.GONE
                binding.recyclerView.visibility=View.VISIBLE
            } else {
                binding.progressBar.visibility = View.GONE
                Toast.makeText(requireContext(), "No Data Available", Toast.LENGTH_LONG).show()


            }

        })


    }
    override fun onDestroy() {
        super.onDestroy()
        _binding == null
    }

}