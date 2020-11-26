package com.ianschoenrock.caroselsamples.viewpager_example

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(activity:AppCompatActivity, private val list: ArrayList<String>): FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = list.count()

    override fun createFragment(position: Int): Fragment {
        var imageFragment = ImageFragment()
        imageFragment.imageURL = list[position]
        return imageFragment
    }
}