package com.dogapikotlin.dogapikotlin.Model

import com.google.gson.annotations.SerializedName


data class DogData(
    @SerializedName("status") var status: String,
    @SerializedName("message")var images: List<String>
)