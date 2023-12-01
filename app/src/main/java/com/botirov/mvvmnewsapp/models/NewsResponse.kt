package com.botirov.mvvmnewsapp.models

import com.botirov.mvvmnewsapp.models.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)