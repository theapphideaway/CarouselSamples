package com.ianschoenrock.caroselsamples

import android.view.View
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.indicator_item.view.*

class IndicatorViewHolder(val view: View): RecyclerView.ViewHolder(view) {
    fun setData(isSelected: Boolean){
        if(isSelected){
            view.indicator_v.background = ContextCompat.getDrawable(view.context, R.drawable.circle_background_selected);
        }
        else view.indicator_v.background = ContextCompat.getDrawable(view.context, R.drawable.circle_background);
    }
}