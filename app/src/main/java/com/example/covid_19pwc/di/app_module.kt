package com.example.covid_19pwc.di

import com.example.covid_19pwc.data.repsitories.TrackingRepository
import com.example.covid_19pwc.network.ServiceGenerator
import com.example.covid_19pwc.ui.TrackingViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import rx.AppSchedulers

val appModule = module {
    single { TrackingRepository() }
    single { AppSchedulers() }
    single { ServiceGenerator().getService() }
    viewModel { TrackingViewModel(get()) }
}