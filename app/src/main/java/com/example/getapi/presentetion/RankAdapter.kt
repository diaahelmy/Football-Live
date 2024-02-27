package com.example.getapi.presentetion


import android.annotation.SuppressLint
import android.text.SpannableStringBuilder
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.getapi.Logo
import com.example.getapi.R
import com.example.getapi.data.Model.LeagueRank.Ranking
import com.example.getapi.databinding.ListrankBinding

class RankAdapter :
    RecyclerView.Adapter<RankAdapter.MyViewHolder>() {
    private val rankList = ArrayList<Ranking>()
    @SuppressLint("NotifyDataSetChanged")
    fun setList(matchRank: List<Ranking>) {
        rankList.clear()
        rankList.addAll(matchRank)
        notifyDataSetChanged()
    }
    class MyViewHolder(val binding: ListrankBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(match: Ranking) {
            binding.apply {
                if (match.Rank == 0) {
                    tempty.text = match.Text
                    tempty.visibility = View.VISIBLE
                    nameteam.visibility = View.GONE
                    rank.visibility = View.GONE
                    win.visibility = View.GONE
                    draw.visibility = View.GONE
                    lose.visibility = View.GONE
                    matchs.visibility = View.GONE
                    goalsScored.visibility = View.GONE
                    goalsAgainst.visibility = View.GONE
                    point.visibility = View.GONE
                    logoteam.visibility = View.GONE
                } else {
                    val away = match.Team_Name
                    val builder = SpannableStringBuilder(away)
                    if (away.length >= 16) {
                        for (i in 0 until away.length - 1) {
                            // Check for space
                            if (away[i] == ' ') {
                                builder.insert(i, "\n")

                            }
                        }
                    }
                    nameteam.text = builder
                    rank.text = match.Rank.toString()
                    tempty.visibility = View.GONE
                    win.text = match.Wins.toString()
                    draw.text = match.Draws.toString()
                    lose.text = match.Losses.toString()
                    matchs.text = match.Matches.toString()
                    goalsScored.text = match.Goals_Scored.toString()
                    goalsAgainst.text = match.Goals_Conceded.toString()
                    point.text = match.Points.toString()
                    val awayLogoId = Logo().getLogoId(match.Team_Name)
                    logoteam.setImageResource(awayLogoId)
                }

            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: ListrankBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.listrank, parent, false)
        return MyViewHolder(binding)
    }
    override fun getItemCount(): Int {
        return rankList.size
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(rankList[position])
    }


}