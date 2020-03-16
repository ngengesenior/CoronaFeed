package com.ngengeapps.coronafeed.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ngengeapps.coronafeed.R

class ProtectYourselfAdapter(val images:List<Int>) : RecyclerView.Adapter<ProtectViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProtectViewHolder {
        val itemLayout = LayoutInflater.from(parent.context).inflate(R.layout.item_protect_yourself,parent,false)
        return ProtectViewHolder(itemLayout)
    }

    override fun getItemCount() = images.size

    override fun onBindViewHolder(holder: ProtectViewHolder, position: Int) {
        holder.bind(images[position])
        holder.indexTextView.text = "${position+1}/${images.size}"
    }


}


class ProtectViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    val imageView: ImageView = itemView.findViewById(R.id.imageView)
    val indexTextView:TextView = itemView.findViewById(R.id.textViewIndex)
    fun bind(image:Int) {
        imageView.setImageResource(image)
    }

}