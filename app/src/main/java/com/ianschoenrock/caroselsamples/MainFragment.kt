package com.ianschoenrock.caroselsamples

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.image_item.view.*

class MainFragment : Fragment() {

    private lateinit var imageLayoutManager: LinearLayoutManager
    private lateinit var indicatorLayoutManager: LinearLayoutManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val imageAdapter = ImageRecyclerAdapter()
        imageLayoutManager = LinearLayoutManager(requireActivity().baseContext, LinearLayoutManager.HORIZONTAL, false)
        indicatorLayoutManager = LinearLayoutManager(requireActivity().baseContext, LinearLayoutManager.HORIZONTAL, false)
        val indicatorAdapter = IndicatorRecyclerAdapter(imageAdapter.itemCount)
        image_rv.adapter = imageAdapter
        image_rv.layoutManager = imageLayoutManager
        indicator_rv.adapter = indicatorAdapter
        indicator_rv.layoutManager = indicatorLayoutManager

        next_scroll_btn.setOnClickListener {
            if(imageLayoutManager.findFirstVisibleItemPosition() != imageAdapter.itemCount){
            imageLayoutManager.smoothScrollToPosition(image_rv, null, imageLayoutManager.findFirstVisibleItemPosition() + 1)
            indicatorAdapter.setIndicator(imageLayoutManager.findFirstVisibleItemPosition() + 1)
            indicatorAdapter.notifyDataSetChanged()
            }
        }
        back_scroll_btn.setOnClickListener {
            if(imageLayoutManager.findFirstVisibleItemPosition() != 0){
                imageLayoutManager.smoothScrollToPosition(image_rv, null, imageLayoutManager.findFirstVisibleItemPosition() - 1)
                indicatorAdapter.setIndicator(imageLayoutManager.findFirstVisibleItemPosition() - 1)
                indicatorAdapter.notifyDataSetChanged()
            }

        }
    }
}