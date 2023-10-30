package com.app.newsinshort.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.app.newsinshort.data.AppConstants
import com.app.newsinshort.data.entity.NewsResponse
import com.app.newsinshort.ui.repository.NewsRepo
import com.app.utilities.ResourceState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class NewsViewModel @Inject constructor(private val newsRepo: NewsRepo) : ViewModel() {
    companion object {
        const val TAG = "NewsViewModel"
    }
    init {
        getNews(AppConstants.COUNTRY)
    }

    private val _news: MutableStateFlow<ResourceState<NewsResponse>> = MutableStateFlow(ResourceState.Loading())
    val news: StateFlow<ResourceState<NewsResponse>> = _news

    fun getNews(country: String) {
        viewModelScope.launch(Dispatchers.IO) {
            newsRepo.getNewsHeadLine(country)
                .collectLatest { newsResponse ->
                    _news.value = newsResponse
                }

        }
    }
}