package com.jetpackcompose.core.model

import com.squareup.moshi.Json

data class Suggestions(
    @field:Json(name = "term") val term : String,
    @field:Json(name = "suggestions") val name1: List<Location>,
)
data class Location(@field:Json(name = "group") val group : String,@field:Json(name = "entities") val enities : List<Entity>)
data class Entity(@field:Json(name = "destinationId") val destinationId : String, @field:Json(name = "name") val name : String )
