package com.example.getapi.presentetion

import android.annotation.SuppressLint
import android.text.SpannableStringBuilder
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.getapi.R
import com.example.getapi.data.Model.MatchLineups.LineupsStatistic

import com.example.getapi.databinding.LineupsrecyclerBinding


class MatchHomeAdapter : RecyclerView.Adapter<MatchHomeAdapter.MyViewHolder>() {
    private val matchList = ArrayList<LineupsStatistic>()

    @SuppressLint("NotifyDataSetChanged")
    fun setList(matchHome: List<LineupsStatistic>) {
        matchList.clear()
        matchList.addAll(matchHome)
        notifyDataSetChanged()
    }

    class MyViewHolder(val binding: LineupsrecyclerBinding) :
        RecyclerView.ViewHolder(binding.root) {

        @SuppressLint("SetTextI18n")
        fun bind(dataplayer: LineupsStatistic) {

            if (dataplayer.Text.isNotEmpty()) {
                binding.text.visibility = View.VISIBLE
                binding.text.text = dataplayer.Text
                binding.cardview.visibility = View.VISIBLE
                binding.goals.visibility = View.GONE
                binding.Formation.visibility = View.GONE
                binding.nameplayer.visibility = View.GONE
                binding.numberplayer.visibility = View.GONE
                binding.minutesPlayed.visibility = View.GONE
                binding.positionplayer.visibility = View.GONE
                binding.goalsScored.visibility = View.GONE
                binding.minutesPlayedid.visibility = View.GONE
                binding.materialTextView.visibility = View.GONE
                binding.rate.visibility = View.GONE
                binding.star.visibility = View.GONE

            } else if (dataplayer.Team == "HOME" && dataplayer.Stats.minutesPlayed >= 1) {
                binding.rate.text = dataplayer.Stats.rating.toString()
                binding.rate.visibility = View.VISIBLE
                if (dataplayer.Stats.rating >= 8.5) {
                    binding.star.visibility = View.VISIBLE
                } else {
                    binding.star.visibility = View.GONE

                }
                binding.text.visibility = View.GONE
                binding.nameplayer.visibility = View.VISIBLE
                binding.cardview.visibility = View.VISIBLE
                binding.Constraint.visibility = View.VISIBLE
                binding.goals.visibility = View.VISIBLE
                binding.Formation.visibility = View.VISIBLE
                binding.numberplayer.visibility = View.VISIBLE
                binding.minutesPlayed.visibility = View.VISIBLE
                binding.positionplayer.visibility = View.VISIBLE
                binding.goalsScored.visibility = View.VISIBLE
                binding.minutesPlayedid.visibility = View.VISIBLE
                binding.materialTextView.visibility = View.VISIBLE
                if (dataplayer.Stats.goals >= 1) {
                    binding.goals.setTextColor(
                        ContextCompat.getColor(
                            binding.goals.context,
                            R.color.red
                        )
                    )
                }
                val away = dataplayer.Name
                val builder = SpannableStringBuilder(away)
                if (away.length >= 13) {
                    for (i in 0 until away.length - 1) {
                        // Check for space
                        if (away[i] == ' ') {
                            builder.insert(i, "\n")

                        }
                    }
                }
                binding.goals.text = dataplayer.Stats.goals.toString()
                binding.Formation.visibility = View.VISIBLE
                binding.Formation.text = dataplayer.Formation
                binding.numberplayer.text = "(${dataplayer.Jersey_Num})"
                binding.nameplayer.text = builder
                binding.minutesPlayed.text = dataplayer.Stats.minutesPlayed.toString()
                binding.positionplayer.text = dataplayer.Position

            } else {
                binding.cardview.visibility = View.GONE
            }


        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: LineupsrecyclerBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.lineupsrecycler, parent, false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return matchList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(matchList[position])
    }


}