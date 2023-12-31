package com.app.newsinshort.ui

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.app.newsinshort.data.entity.NewsResponse
import com.app.newsinshort.ui.components.Loader
import com.app.newsinshort.ui.components.NewsList
import com.app.newsinshort.ui.viewmodel.NewsViewModel
import com.app.utilities.ResourceState

const val TAG = "HomeScreen"
@Composable
fun HomeScreen(
    newsViewModel: NewsViewModel = hiltViewModel()
) {

    val newsResponse by newsViewModel.news.collectAsState()

    Surface(
        color = Color.White,
        modifier = Modifier.fillMaxSize()
    ) {
        when (newsResponse) {
            is ResourceState.Loading -> {
                Log.e(TAG, "INSIDE_LOADING")
                Loader()
            }

            is ResourceState.Success -> {
                Log.e(TAG, "INSIDE_SUcCESS")
                val response = (newsResponse as ResourceState.Success<*>).data
                NewsList(response as NewsResponse?)
            }

            is ResourceState.Error -> {
                Log.e(TAG, "INSIDE_ERROR")
            }
        }


    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}