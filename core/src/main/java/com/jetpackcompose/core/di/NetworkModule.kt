package com.jetpackcompose.core.di

import com.jetpackcompose.core.HotelService
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {

    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor {
                val currentRequest = it.request().newBuilder()
                currentRequest.addHeader(
                    "x-rapidapi-key",
                    ""
                )
                currentRequest.addHeader("x-rapidapi-host", "hotels4.p.rapidapi.com")
                currentRequest.addHeader("useQueryString", "true")
                it.proceed(currentRequest.build())
            }
            .build()
    }

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(okHttpClient)
            .addConverterFactory(MoshiConverterFactory.create())
            .baseUrl("https://hotels4.p.rapidapi.com/")
            .build()
    }

    @Provides
    @Singleton
    fun provideHotelService(retrofit: Retrofit) : HotelService{
        return retrofit.create(HotelService::class.java)
    }
}
