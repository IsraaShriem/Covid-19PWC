package com.example.covid_19pwc.data.repsitories

import com.example.covid_19pwc.network.EndPoints
import org.koin.core.KoinComponent
import org.koin.core.inject

open class BaseRepository : KoinComponent {
    protected val endPoints: EndPoints by inject()

}