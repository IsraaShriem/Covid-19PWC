package com.example.covid_19pwc.network

import android.content.ContentValues
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class ServiceGenerator {


    fun getService(): EndPoints {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(getHttpClient())
            .build()
        return retrofit.create(EndPoints::class.java)
    }


    private fun getHttpClient(): OkHttpClient {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        val httpClientBuilder = OkHttpClient.Builder()
        httpClientBuilder.interceptors().add(interceptor)

        httpClientBuilder.addInterceptor {
            val originalRequest = it.request()
            val newBuilder = it.request()
                .newBuilder()
                .headers(originalRequest.headers())

                .addHeader("Content-Type", "application/json")

                .method(originalRequest.method(), originalRequest.body())

            it.proceed(newBuilder.build())
        }
        httpClientBuilder.connectTimeout(250, TimeUnit.SECONDS)
        httpClientBuilder.interceptors().add(CurlLoggerInterceptor(ContentValues.TAG))

        return httpClientBuilder.build()
    }


    companion object {

        const val BASE_URL = "https://restcountries.eu/rest/v2/"
    }
}