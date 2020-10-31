package com.example.covid_19pwc.ui

import androidx.lifecycle.MutableLiveData
import com.example.covid_19pwc.data.BaseViewModel
import com.example.covid_19pwc.data.model.CountriesResponse
import com.example.covid_19pwc.data.model.NewsApiResponse
import com.example.covid_19pwc.data.model.TrackingApiResponse
import com.example.covid_19pwc.data.repsitories.TrackingRepository
import com.jakewharton.rxrelay2.BehaviorRelay
import io.reactivex.rxkotlin.addTo

class TrackingViewModel(private val trackingRepository: TrackingRepository) : BaseViewModel() {

    val trackingApiResponse: BehaviorRelay<TrackingApiResponse> = BehaviorRelay.create()
    val countriesResponse: BehaviorRelay<ArrayList<CountriesResponse>> = BehaviorRelay.create()
    val newsResponse: BehaviorRelay<NewsApiResponse> = BehaviorRelay.create()
    val loaderVisibility = MutableLiveData<Boolean>()

    fun getTrackingApi(fromDate: String, toDate: String) {
        trackingRepository.getTrackingApi(fromDate, toDate)
            .subscribeOn(schedulers.getIoScheduler())
            .observeOn(schedulers.getAndroidScheduler())
            .doOnSubscribe { loaderVisibility.value=true }
            .doOnError { loaderVisibility.value=false }
            .subscribe({
                loaderVisibility.value=false
                trackingApiResponse.accept(it)
            }, {
                it.printStackTrace()
            })
            .addTo(bag)
    }

    fun getCountries(name: String, fullText: Boolean) {
        trackingRepository.getCountries(name, fullText)
            .subscribeOn(schedulers.getIoScheduler())
            .observeOn(schedulers.getAndroidScheduler())
            .doOnSubscribe { loaderVisibility.value=true }
            .doOnError { loaderVisibility.value=false }
            .subscribe({
                loaderVisibility.value=false
                countriesResponse.accept(it)

            }, {
                it.printStackTrace()
            })
            .addTo(bag)
    }

    fun getNews(country: String, category: String, apiKey: String) {
        trackingRepository.getNews(country, category, apiKey)
            .subscribeOn(schedulers.getIoScheduler())
            .observeOn(schedulers.getAndroidScheduler())
            .doOnSubscribe { loaderVisibility.value=true }
            .doOnError { loaderVisibility.value=false }
            .subscribe({
                loaderVisibility.value=false
                newsResponse.accept(it)

            }, {
                it.printStackTrace()
            })
            .addTo(bag)
    }


}