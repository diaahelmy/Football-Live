package com.example.getapi.Presentetion

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.getapi.Logo
import com.example.getapi.R
import com.example.getapi.databinding.FragmentMatchBinding
import com.example.getapi.databinding.ListlivematchBinding

class MatchFragment : Fragment() {
    private var _binding: FragmentMatchBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentMatchBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val arguments = arguments ?: return // Handle null arguments

        val match = MatchFragmentArgs.fromBundle(arguments).matchid
        binding.apply {
            tAwayScore.text = match.Away_Score.toString()
            tHomeScore.text = match.Home_Score.toString()
            tAwayTeam.text = match.Away_Team
            tHomeTeam.text = match.Home_Team
            time.text = match.Status
            leagname.text = match.League
            val awayLogoId = Logo().getLogoId(match.Away_Team)
            val homeLogoId = Logo().getLogoId(match.Home_Team)
            logoalHilal.setImageResource(awayLogoId)
            logoalHilalhome.setImageResource(homeLogoId)
            logoalHilal.setOnClickListener {
                val action = MatchFragmentDirections.actionMatchFragmentToRnakFragment(match)
                it.findNavController().navigate(action)
            }
            logoalHilalhome.setOnClickListener {
                val action = MatchFragmentDirections.actionMatchFragmentToRnakFragment(match)
                it.findNavController().navigate(action)
            }
        }
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding == null
    }

}