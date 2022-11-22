package com.test.projectDem.data.remote

import com.test.projectDem.data.models.Repo
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface APIService {

    @GET("https://api.github.com/search/repositories?q=android=&since=daily&spoken_language_code=")
    fun getRepositories(@Query("page") page: Int): Call<Repo>
}
