package com.ianschoenrock.caroselsamples

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.image_item.view.*

class ImageViewHolder(val view: View): RecyclerView.ViewHolder(view) {
    fun setData(imageURL: String){
        Picasso.get().load(imageURL).into(view.image_iv)
    }
}