package com.ngengeapps.coronafeed.models

import com.google.gson.annotations.SerializedName


/**
 * This represents the full feed serialized
 */

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