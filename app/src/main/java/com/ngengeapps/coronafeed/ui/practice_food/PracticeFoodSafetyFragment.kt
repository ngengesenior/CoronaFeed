package com.ngengeapps.coronafeed.ui.practice_food

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.ngengeapps.coronafeed.R
import com.ngengeapps.coronafeed.adapters.ImagesInfoAdapter
import com.ngengeapps.coronafeed.models.foodSafetyData
import kotlinx.android.synthetic.main.base_pager_layout.*

/**
 * A simple [Fragment] subclass.
 */
class PracticeFoodSafetyFragment : Fragment(R.layout.base_pager_layout) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val adapter = ImagesInfoAdapter(foodSafetyData)
        viewPager.adapter = adapter
        super.onViewCreated(view, savedInstanceState)
    }

}
