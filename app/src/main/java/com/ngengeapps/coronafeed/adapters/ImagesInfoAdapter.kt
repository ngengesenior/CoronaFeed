package com.ngengeapps.coronafeed.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mukesh.MarkdownView
import com.ngengeapps.coronafeed.R

class ImagesInfoAdapter(val images:List<Int>) : RecyclerView.Adapter<ImageInfoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageInfoViewHolder {
        val itemLayout = LayoutInflater.from(parent.context).inflate(R.layout.item_protect_yourself,parent,false)
        return ImageInfoViewHolder(itemLayout)
    }

    override fun getItemCount() = images.size

    override fun onBindViewHolder(holder: ImageInfoViewHolder, position: Int) {
        holder.bind(images[position])
        holder.indexTextView.text = "${position+1}/${images.size}"
    }


}


class ImageInfoViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    val imageView: ImageView = itemView.findViewById(R.id.imageView)
    val indexTextView:TextView = itemView.findViewById(R.id.textViewIndex)
    fun bind(image:Int) {
        imageView.setImageResource(image)
    }

}


class FAQsAdapter(val files:List<String>) : RecyclerView.Adapter<FAQViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FAQViewHolder {
        val itemLayout = LayoutInflater.from(parent.context).inflate(R.layout.fragment_faqq,parent,false)
        return FAQViewHolder(itemLayout)
    }



    override fun getItemCount() = files.size

    override fun onBindViewHolder(holder: FAQViewHolder, position: Int) {
        holder.bind(files[position])
        holder.indexTextView.text = "${position+1}/${files.size}"
    }


}

class FAQViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

    val markDownView:MarkdownView = itemView.findViewById(R.id.markdownView)
    val indexTextView:TextView = itemView.findViewById(R.id.textViewIndex)
    fun bind(fileName:String) {
        markDownView.loadMarkdownFromAssets("$fileName.md")

    }
}