package com.app.newsinshort.data.datasource

import com.app.newsinshort.data.api.ApiService
import com.app.newsinshort.data.entity.NewsResponse
import retrofit2.Response
import javax.inject.Inject

class NewsDataSourceIMpl @Inject constructor (
    private val apiService: ApiService
): NewsDataSource {
    override suspend fun getNewsHeadlines(country: String): Response<NewsResponse> {
        return apiService.getNewsHeadLine(country)
    }
}