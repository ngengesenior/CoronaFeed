package com.ngengeapps.coronafeed.models

import com.google.gson.annotations.SerializedName
import com.ngengeapps.coronafeed.R


/**
 * This represents the full feed serialized
 */

val protectYourselfData = listOf(R.drawable.coro_1, R.drawable.coro_2, R.drawable.coro_3, R.drawable.coro_4)
val protectWhileTravelling = listOf(R.drawable.stay_safe1,R.drawable.stay_safe2,
    R.drawable.stay_safe3,R.drawable.stay_safe4,R.drawable.stay_safe5)

val foodSafetyData = listOf(R.drawable.practice_food1,R.drawable.practice_food2,R.drawable.practice_food3)
data class Feeds(
    @SerializedName("feed") val feed: Feed
)


data class Feed(
    @SerializedName("entry") val entries:MutableList<Content>,
    @SerializedName("updated") val updated: Data
)


class Content(
    @SerializedName("gsx\$country") val country: Data,
    @SerializedName("gsx\$confirmedcases") val confirmedCases: Data,
    @SerializedName("gsx\$reporteddeaths") val reportedDeaths:Data
)


data class Data(
    @SerializedName("\$t") val item:String
)