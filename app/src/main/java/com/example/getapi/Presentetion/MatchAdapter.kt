package com.example.getapi.Presentetion

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.getapi.Logo
import com.example.getapi.R
import com.example.getapi.data.Model.LiveMatch.MatchLiveData
import com.example.getapi.databinding.ListlivematchBinding

class MatchAdapter( private val viewModel: MyViewModel) :
    RecyclerView.Adapter<MatchAdapter.MyViewHolder>() {
    private val matchList = ArrayList<MatchLiveData>()

    fun setList(movies: List<MatchLiveData>) {
        matchList.clear()
        matchList.addAll(movies)

    }

    companion object {
        var leagueId: String = "2" // Set the default value here
    }

    class MyViewHolder(val binding: ListlivematchBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(match: MatchLiveData, viewModel: MyViewModel) {
            viewModel.updateMatchDetails(match)

            binding.tAwayScore.text = match.Away_Score.toString()
            binding.tHomeScore.text = match.Home_Score.toString()
            binding.tAwayTeam.text = match.Away_Team
            binding.tHomeTeam.text = match.Home_Team
            binding.time.text = match.Status
            binding.leagname.text = match.League
            //
            binding.cardview.setOnClickListener {

                val action = MainFragmentDirections.actionMainFragmentToMatchFragment(match)
                it.findNavController().navigate(action)


            }


//            binding.logoalHilal.setOnClickListener {
//
//                val action = MainFragmentDirections.actionMainFragmentToRnakFragment(match.League_ID.toString())
//                it.findNavController().navigate(action)
//            }


//            binding.logoalHilalhome.setOnClickListener {
//
//                val action = MainFragmentDirections.actionMainFragmentToRnakFragment(match.League_ID.toString())
//                it.findNavController().navigate(action)
//            }


//            logo.create_logo()
            val awayLogoId = Logo().getLogoId(match.Away_Team)

            val homeLogoId = Logo().getLogoId(match.Home_Team)

            binding.logoalHilal.setImageResource(awayLogoId)
            binding.logoalHilalhome.setImageResource(homeLogoId)


//            viewModel.Away_Score.observe(viewLifecycleOwner) { awayScore ->
//                binding.tAwayScore.text = awayScore.toString()
//            }
//            viewModel.AwayTeam.observe(viewLifecycleOwner) { awayTeam ->
//                binding.tAwayTeam.text = awayTeam.toString()
//            }
//            viewModel.HomeTeam.observe(viewLifecycleOwner) { homeTeam ->
//                binding.tHomeTeam.text = homeTeam.toString()
//            }
//            viewModel.Home_Score.observe(viewLifecycleOwner) { homeScore ->
//                binding.tHomeScore.text = homeScore.toString()
//            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: ListlivematchBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.listlivematch, parent, false)
        return MyViewHolder(binding)
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.bind(matchList[position], viewModel)

    }

    override fun getItemCount(): Int {
        return matchList.size
    }
}
