package model

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Client {

    private val BASE_URL = "https://api.open-meteo.com/v1/"
    private var retrofit: Retrofit

    init {
        val gson = GsonBuilder()
            .setLenient()
            .create()
        retrofit =Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()

    }


}