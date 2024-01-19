package br.com.jonathanarodr.feature

import com.google.gson.annotations.SerializedName

data class GreetingResponse(
    @SerializedName("greeting")
    val greeting: String,
)
