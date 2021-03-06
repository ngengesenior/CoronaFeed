package com.ngengeapps.coronafeed.ui.protection

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.ngengeapps.coronafeed.R
import com.ngengeapps.coronafeed.adapters.ImagesInfoAdapter
import com.ngengeapps.coronafeed.models.protectYourselfData
import kotlinx.android.synthetic.main.base_pager_layout.*


class ProtectYourselfFragmentFragment : Fragment(R.layout.base_pager_layout) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val adapter = ImagesInfoAdapter(protectYourselfData)
        viewPager.adapter = adapter
        super.onViewCreated(view, savedInstanceState)
    }
}
