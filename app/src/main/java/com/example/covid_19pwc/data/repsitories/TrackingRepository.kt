package com.example.covid_19pwc.data.repsitories

import com.example.covid_19pwc.data.model.CountriesResponse
import com.example.covid_19pwc.data.model.NewsApiResponse
import com.example.covid_19pwc.data.model.TrackingApiResponse
import io.reactivex.Single

class TrackingRepository : BaseRepository() {

    fun getTrackingApi(fromDate:String,toDate:String) : Single<TrackingApiResponse>{
        return endPoints.getTrackingApi(fromDate,toDate)
    }

    fun getCountries(name:String,fullText:Boolean) : Single<ArrayList<CountriesResponse>>{
        return endPoints.getCountries(name,fullText)
    }

    fun getNews(country:String,category:String,apiKey:String) : Single<NewsApiResponse>{
        return endPoints.getNewsApi(country,category,apiKey)
    }

}