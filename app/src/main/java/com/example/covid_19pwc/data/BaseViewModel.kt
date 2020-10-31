package com.example.covid_19pwc.data

import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable
import org.koin.core.KoinComponent
import org.koin.core.inject
import rx.AppSchedulers

open class BaseViewModel : ViewModel(), KoinComponent {

    val bag = CompositeDisposable()
    val schedulers: AppSchedulers by inject()

    override fun onCleared() {
        super.onCleared()
        bag.clear()
    }
}