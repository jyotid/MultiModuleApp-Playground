package com.jetpackcompose.core

import com.jetpackcompose.core.model.Suggestions
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface HotelService {
    @GET("locations/search")
    fun getHotelsAtLocation(
        @Query("query") city : String,
        @Query("locale") local: String
    ): Single<Suggestions>
}
