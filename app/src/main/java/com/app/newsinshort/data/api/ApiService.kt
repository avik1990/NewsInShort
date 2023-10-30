package com.app.newsinshort.data.api

import com.app.newsinshort.data.entity.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("v2/top-headlines")
    suspend fun getNewsHeadLine(
        @Query("country") country :String,
        @Query("apiKey") apiKey :String = ""
    ) : Response<NewsResponse>
}