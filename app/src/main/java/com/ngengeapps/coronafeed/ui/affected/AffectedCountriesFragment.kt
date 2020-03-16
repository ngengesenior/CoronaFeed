package com.ngengeapps.coronafeed.ui.affected

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import com.ngengeapps.coronafeed.R
import com.ngengeapps.coronafeed.WebService
import com.ngengeapps.coronafeed.adapters.CoronaCasesAdapter
import kotlinx.android.synthetic.main.fragment_affected_countries.*
import kotlinx.android.synthetic.main.fragment_affected_countries.recyclerView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import java.lang.Exception
import java.net.UnknownHostException

class AffectedCountriesFragment : Fragment(R.layout.fragment_affected_countries) {

    val webService: WebService by lazy {
        WebService.create()
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val adapter = CoronaCasesAdapter(mutableListOf())
        recyclerView.adapter = adapter
        val uiScope = CoroutineScope(Dispatchers.Main + Job())
        uiScope.launch {
            try {
                val response = webService.getCases()
                if (response.isSuccessful) {

                    Log.d(tag, "Response is ${response.body()}")
                    adapter.setList(response.body()!!.feed.entries)
                    progressBar.visibility = View.GONE
                } else {
                    Log.e(tag,"Failed ${response.code()}")
                }

            } catch (unk: UnknownHostException) {

                Log.e(tag, "Unknown Host")

            }
            catch (ex: Exception) {

                Log.e(tag, "Exception ${ex.message}")
            }
        }
        super.onViewCreated(view, savedInstanceState)
    }
}
