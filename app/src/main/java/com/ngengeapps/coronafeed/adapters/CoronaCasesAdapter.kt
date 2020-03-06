package com.ngengeapps.coronafeed.adapters

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.cardview.widget.CardView
import com.ngengeapps.coronafeed.R
import com.ngengeapps.coronafeed.models.Content
import kotlinx.android.synthetic.main.item_country.view.*

class CoronaCasesAdapter(var cases:MutableList<Content>) :RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_country,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount() = cases.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val content = cases[position]
        holder.bind(content)
    }

    fun setList(newData:MutableList<Content>) {
        cases = newData
        notifyDataSetChanged()

    }
}


class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {

    val countryTextView:TextView = itemView.findViewById(R.id.textView_country)
    val confirmedTextView:TextView = itemView.findViewById(R.id.textView_cases)
    val deathsTextView:TextView = itemView.findViewById(R.id.textView_deaths)

    fun bind(content: Content) {
        content.apply {
            countryTextView.text = country.item
            confirmedTextView.text = confirmedCases.item
            deathsTextView.text = reportedDeaths.item
        }
    }

}