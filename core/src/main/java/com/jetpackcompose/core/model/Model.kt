package com.jetpackcompose.core.model

import com.squareup.moshi.Json

data class Hotel(
    @field:Json(name = "name") val name1: String,
    @field:Json(name = "starRating") val rating: String,
    @field:Json(name = "thumbnailUrl") val url: String
)
