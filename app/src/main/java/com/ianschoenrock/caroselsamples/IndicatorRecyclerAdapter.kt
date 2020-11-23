package com.ianschoenrock.caroselsamples

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class IndicatorRecyclerAdapter(private val listSize: Int): RecyclerView.Adapter<IndicatorViewHolder>() {

    var currentItem = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IndicatorViewHolder {
        val inflater = LayoutInflater.from(parent.context).inflate(R.layout.indicator_item, parent, false)
        return  IndicatorViewHolder(inflater)
    }

    override fun getItemCount(): Int = listSize

    override fun onBindViewHolder(holder: IndicatorViewHolder, position: Int) {
        if(currentItem == position) holder.setData(true)
        else holder.setData(false)
    }

    fun setIndicator(position: Int){
        currentItem = position
    }
}