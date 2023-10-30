package com.app.newsinshort.data.datasource

import com.app.newsinshort.data.entity.NewsResponse
import retrofit2.Response

interface NewsDataSource {

    suspend fun getNewsHeadlines(
        country: String
    ): Response<NewsResponse>
}