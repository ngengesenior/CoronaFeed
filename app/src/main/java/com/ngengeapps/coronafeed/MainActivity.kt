package com.ngengeapps.coronafeed

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.ngengeapps.coronafeed.adapters.CoronaCasesAdapter
import com.ngengeapps.coronafeed.models.Content
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import java.lang.Exception
import java.net.UnknownHostException
import kotlin.coroutines.CoroutineContext

class MainActivity : AppCompatActivity() {

    val webService:WebService by lazy {
        WebService.create()
    }
    val tag ="TAG--"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
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

            } catch (unk:UnknownHostException) {

                Log.e(tag, "Unknown Host")

            }
            catch (ex:Exception) {

                Log.e(tag, "Exception ${ex.message}")
            }
        }


    }
}
