package com.ngengeapps.coronafeed.ui.ready

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.ngengeapps.coronafeed.R
import com.ngengeapps.coronafeed.adapters.ImagesInfoAdapter
import com.ngengeapps.coronafeed.models.beReadyData
import kotlinx.android.synthetic.main.base_pager_layout.*


/**
 * A simple [Fragment] subclass.
 */
class BeReadyFragment : Fragment(R.layout.base_pager_layout) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val adapter = ImagesInfoAdapter(beReadyData)
        viewPager.adapter = adapter
        super.onViewCreated(view, savedInstanceState)
    }

}
