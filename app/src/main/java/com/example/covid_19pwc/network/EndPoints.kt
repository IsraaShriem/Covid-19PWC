package com.example.covid_19pwc.network

import com.example.covid_19pwc.data.model.CountriesResponse
import com.example.covid_19pwc.data.model.NewsApiResponse
import com.example.covid_19pwc.data.model.TrackingApiResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface EndPoints {

    @GET("https://api.covid19tracking.narrativa.com/api")
    fun getTrackingApi(
        @Query("date_from") dateFrom: String, @Query("to_date") dateTo: String
    ): Single<TrackingApiResponse>

    @GET("https://restcountries.eu/rest/v2")
    fun getCountries(
        @Query("name") name: String, @Query("fullText") fullText: Boolean
    ): Single<ArrayList<CountriesResponse>>

    @GET("https://newsapi.org/v2/top-headlines")
    fun getNewsApi(
        @Query("country") country: String,
        @Query("category") category: String,
        @Query("apiKey") apiKey: String
    ): Single<NewsApiResponse>

}