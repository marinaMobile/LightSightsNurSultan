package com.wthrnrslt.lightsightsnursultan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RVAdapter (private val data:List<DataModel>) : RecyclerView.Adapter<RVAdapter.CustomViewHolder>() {

    class CustomViewHolder(parent: View): RecyclerView.ViewHolder(parent) {

        val img: ImageView = parent.findViewById(R.id.custom_img)
        val txt: TextView = parent.findViewById(R.id.custom_txt)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {

        return CustomViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.rv_item,parent,false))
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {

        holder.img.setImageResource(data[position].img)
        holder.txt.text = data[position].txt
    }

    override fun getItemCount(): Int = data.count()
}