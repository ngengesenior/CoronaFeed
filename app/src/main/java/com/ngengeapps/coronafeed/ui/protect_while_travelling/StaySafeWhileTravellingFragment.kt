package com.ngengeapps.coronafeed.ui.protect_while_travelling

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.ngengeapps.coronafeed.R
import com.ngengeapps.coronafeed.adapters.ImagesInfoAdapter
import com.ngengeapps.coronafeed.models.protectWhileTravelling
import kotlinx.android.synthetic.main.base_pager_layout.*

/**
 * A simple [Fragment] subclass.
 */
class StaySafeWhileTravellingFragment : Fragment(R.layout.base_pager_layout) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val adapter = ImagesInfoAdapter(protectWhileTravelling)
        viewPager.adapter = adapter
        super.onViewCreated(view, savedInstanceState)
    }

}
