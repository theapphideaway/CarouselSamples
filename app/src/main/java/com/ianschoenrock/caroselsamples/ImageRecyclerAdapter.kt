package com.ianschoenrock.caroselsamples

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ImageRecyclerAdapter: RecyclerView.Adapter<ImageViewHolder>() {

    val imagearray = arrayListOf(
        "http://apitest321.xyz/photos/cordoba_c5.png",
        "http://apitest321.xyz/photos/cordoba_c5_ce_sp.png",
        "http://apitest321.xyz/photos/cordoba_esteso_cd.png",
        "http://apitest321.xyz/photos/cordoba_c7.png"
        )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val inflater = LayoutInflater.from(parent.context).inflate(R.layout.image_item, parent, false)
        return ImageViewHolder(inflater)
    }

    override fun getItemCount(): Int = imagearray.count()

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.setData(imagearray[position])
    }
}