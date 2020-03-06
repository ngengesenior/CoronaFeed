package com.ngengeapps.coronafeed

import com.ngengeapps.coronafeed.models.Feeds
import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface WebService {

    @GET("newdata.json")
    suspend fun getCases():Response<Feeds>

    companion object{

        private val client: OkHttpClient = OkHttpClient().newBuilder()
            .build()

    private fun create(httpUrl: HttpUrl): WebService = Retrofit.Builder()
        .client(client)
        .baseUrl(httpUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(WebService::class.java)

    fun create(): WebService = create(HttpUrl.parse("https://infographics.channelnewsasia.com/covid-19/")!!)
}
}