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

    private lateinit var layoutManager: LinearLayoutManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = ImageRecyclerAdapter()
        layoutManager = LinearLayoutManager(requireActivity().baseContext, LinearLayoutManager.HORIZONTAL, false)
        image_rv.adapter = adapter
        image_rv.layoutManager = layoutManager
        next_scroll_btn.setOnClickListener {
            layoutManager.smoothScrollToPosition(image_rv, null, layoutManager.findFirstVisibleItemPosition() + 1)
        }
        back_scroll_btn.setOnClickListener {
            if(layoutManager.findFirstVisibleItemPosition() != 0)
            layoutManager.smoothScrollToPosition(image_rv, null, layoutManager.findFirstVisibleItemPosition() - 1)
        }
    }
}