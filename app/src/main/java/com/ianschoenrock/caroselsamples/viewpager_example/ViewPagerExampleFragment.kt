package com.ianschoenrock.caroselsamples.viewpager_example

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.ianschoenrock.caroselsamples.R
import kotlinx.android.synthetic.main.fragment_view_pager_example.view.*

class ViewPagerExampleFragment : Fragment() {

    val imagearray = arrayListOf(
        "http://apitest321.xyz/photos/cordoba_c5.png",
        "http://apitest321.xyz/photos/cordoba_c5_ce_sp.png",
        "http://apitest321.xyz/photos/cordoba_esteso_cd.png",
        "http://apitest321.xyz/photos/cordoba_c7.png"
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_view_pager_example, container, false).apply {
            val viewPager = findViewById<ViewPager2>(R.id.image_vp)
            viewPager.isUserInputEnabled = false
            viewPager.adapter = ViewPagerAdapter(activity as AppCompatActivity, imagearray)

            vp_next_btn.setOnClickListener {
                viewPager.currentItem += 1
            }

            vp_back_btn.setOnClickListener {
                viewPager.currentItem -= 1
            }
        }
    }


}