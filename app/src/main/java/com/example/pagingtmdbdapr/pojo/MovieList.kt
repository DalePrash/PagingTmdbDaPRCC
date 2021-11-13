package com.example.pagingtmdbdapr.pojo

import com.google.gson.annotations.SerializedName

data class MovieList (
    @SerializedName("results")
    val movies: List<Movies>
)
data class Movies(
    @SerializedName("original_title")
    val movieTitle: String,
    @SerializedName("original_language")
    val movieLanguage: String
    )