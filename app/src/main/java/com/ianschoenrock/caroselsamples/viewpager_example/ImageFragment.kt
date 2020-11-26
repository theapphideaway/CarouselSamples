package com.ianschoenrock.caroselsamples.viewpager_example

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ianschoenrock.caroselsamples.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_image.view.*
import kotlinx.android.synthetic.main.image_item.view.*

class ImageFragment : Fragment() {

    var imageURL: String? = null



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_image, container, false).apply{
            Picasso.get().load(imageURL).into(viewpagerimage_iv)
        }
    }
}