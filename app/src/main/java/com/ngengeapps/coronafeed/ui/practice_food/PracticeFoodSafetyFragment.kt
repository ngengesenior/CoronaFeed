package com.ngengeapps.coronafeed.ui.practice_food

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ngengeapps.coronafeed.R
import com.ngengeapps.coronafeed.adapters.ProtectYourselfAdapter
import com.ngengeapps.coronafeed.models.foodSafetyData
import com.ngengeapps.coronafeed.models.protectWhileTravelling
import kotlinx.android.synthetic.main.fragment_practice_food_safety.*

/**
 * A simple [Fragment] subclass.
 */
class PracticeFoodSafetyFragment : Fragment(R.layout.fragment_practice_food_safety) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val adapter = ProtectYourselfAdapter(foodSafetyData)
        viewPager.adapter = adapter
        super.onViewCreated(view, savedInstanceState)
    }

}
