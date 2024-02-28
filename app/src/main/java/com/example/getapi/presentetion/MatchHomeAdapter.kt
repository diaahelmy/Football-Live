package com.example.getapi.presentetion

import android.annotation.SuppressLint
import android.graphics.Typeface
import android.text.SpannableStringBuilder
import android.util.TypedValue
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

            binding.apply {
                if (dataplayer.Team == "HOME" && dataplayer.Stats.minutesPlayed >= 1) {
                    rate.text = dataplayer.Stats.rating.toString()
                    rate.visibility = View.VISIBLE
                    if (dataplayer.Stats.rating >= 7.8) {
                        star.visibility = View.VISIBLE
                    } else {
                        star.visibility = View.GONE

                    }
                    text.visibility = View.GONE
                    nameplayer.visibility = View.VISIBLE
                    cardview.visibility = View.VISIBLE
                    Constraint.visibility = View.VISIBLE
                    goals.visibility = View.VISIBLE
                    Formation.visibility = View.VISIBLE
                    numberplayer.visibility = View.VISIBLE
                    minutesPlayed.visibility = View.VISIBLE
                    positionplayer.visibility = View.VISIBLE
                    goalsScored.visibility = View.VISIBLE
                    minutesPlayedid.visibility = View.VISIBLE
                    materialTextView.visibility = View.VISIBLE
                    if (dataplayer.Stats.goals >= 1) {
                        binding.goals.setTextColor(
                            ContextCompat.getColor(
                                binding.goals.context,
                                R.color.seed
                            )
                        )

                        goals.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20f)
                        goals.setTypeface(null, Typeface.BOLD)

                    }
                    val home = dataplayer.Name
                    val builder = SpannableStringBuilder(home)
                    if (home.length >= 11) {
                        for (i in 0 until home.length - 1) {
                            // Check for space
                            if (home[i] == ' ') {
                                builder.insert(i, "\n")

                            }
                        }
                    }
                    goals.text = dataplayer.Stats.goals.toString()
                    Formation.visibility = View.VISIBLE
                    Formation.text = dataplayer.Formation
                    numberplayer.text = "(${dataplayer.Jersey_Num})"
                    nameplayer.text = builder
                    minutesPlayed.text = dataplayer.Stats.minutesPlayed.toString()
                    positionplayer.text = dataplayer.Position

                } else {
                    text.visibility = View.VISIBLE
                    nameplayer.visibility = View.GONE
                    cardview.visibility = View.GONE
                    Constraint.visibility = View.GONE
                    goals.visibility = View.GONE
                    Formation.visibility = View.GONE
                    numberplayer.visibility = View.GONE
                    minutesPlayed.visibility = View.GONE
                    positionplayer.visibility = View.GONE
                    goalsScored.visibility = View.GONE
                    materialTextView.visibility = View.GONE
                }

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