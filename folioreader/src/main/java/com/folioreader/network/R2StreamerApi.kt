package com.folioreader.network

import androidx.annotation.Keep
import org.readium.r2.shared.Locator
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

@Keep
interface R2StreamerApi {

    @GET("search") @Gson
    fun search(@Query("spineIndex") spineIndex: Int, @Query("query") query: String): Call<List<Locator>>
}