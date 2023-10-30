package com.app.newsinshort.ui.repository

import android.util.Log
import com.app.newsinshort.data.datasource.NewsDataSource
import com.app.newsinshort.data.entity.NewsResponse
import com.app.utilities.ResourceState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class NewsRepo @Inject constructor(
    private val newsDataSource: NewsDataSource
) {
    suspend fun getNewsHeadLine(country: String): Flow<ResourceState<NewsResponse>> {
        return flow {
            emit(ResourceState.Loading())
            val response = newsDataSource.getNewsHeadlines(country)
            if (response.isSuccessful && response.body() != null) {
                emit(ResourceState.Success(response.body()!!))
            } else {
                emit(ResourceState.Error("Error fetching news data"))
            }
        }.catch { e ->
            emit(ResourceState.Error(e))
            Log.e("ERROR============", e.toString())
        }
    }

}