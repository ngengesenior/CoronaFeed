package com.ngengeapps.coronafeed.ui.protect_while_travelling

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.ngengeapps.coronafeed.R
import com.ngengeapps.coronafeed.adapters.ProtectYourselfAdapter
import com.ngengeapps.coronafeed.models.protectWhileTravelling
import kotlinx.android.synthetic.main.fragment_stay_safe_while_travelling.*

/**
 * A simple [Fragment] subclass.
 */
class StaySafeWhileTravellingFragment : Fragment(R.layout.fragment_stay_safe_while_travelling) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val adapter = ProtectYourselfAdapter(protectWhileTravelling)
        viewPager.adapter = adapter
        super.onViewCreated(view, savedInstanceState)
    }

}
