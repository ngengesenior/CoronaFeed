package com.ngengeapps.coronafeed.ui.faq

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.ngengeapps.coronafeed.R
import com.ngengeapps.coronafeed.adapters.FAQsAdapter
import com.ngengeapps.coronafeed.adapters.ImagesInfoAdapter
import com.ngengeapps.coronafeed.models.beReadyData
import com.ngengeapps.coronafeed.models.faqsFiles
import kotlinx.android.synthetic.main.base_pager_layout.*
import kotlinx.android.synthetic.main.fragment_faqq.*

/**
 * A simple [Fragment] subclass.
 */
class FAQFragment : Fragment(R.layout.base_pager_layout) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val adapter = FAQsAdapter(faqsFiles)
        viewPager.adapter = adapter
        super.onViewCreated(view, savedInstanceState)
    }

}
