package com.ngengeapps.coronafeed.ui.protection

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.ngengeapps.coronafeed.R
import com.ngengeapps.coronafeed.adapters.ProtectYourselfAdapter
import com.ngengeapps.coronafeed.models.protectYourselfData
import kotlinx.android.synthetic.main.fragment_protect.*

class ProtectYourselfFragmentFragment : Fragment(R.layout.fragment_protect) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val adapter = ProtectYourselfAdapter(protectYourselfData)
        viewPager.adapter = adapter
        super.onViewCreated(view, savedInstanceState)
    }
}
