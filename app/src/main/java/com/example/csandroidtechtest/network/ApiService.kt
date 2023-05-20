package com.example.csandroidtechtest.network

import com.example.csandroidtechtest.model.CreditReport
import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiService {
    @GET("endpoint.json")
    fun getScore(): List<CreditReport>

    companion object {
        var apiService:ApiService? = null
        fun getInstance() : ApiService {
            if (apiService == null){
                apiService = Retrofit.Builder()
                    .baseUrl("https://android-interview.s3.eu-west-2.amazonaws.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build().create(ApiService::class.java)
            }
            return apiService!!
        }
    }
}