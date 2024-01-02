package com.dogapikotlin.dogapikotlin.Interface

import com.dogapikotlin.dogapikotlin.Model.DogData
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiService {
    @GET()
    suspend fun getDogsByBreeds(@Url url: String): Response<DogData>
}