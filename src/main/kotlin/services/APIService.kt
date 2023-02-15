package services

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface APIService {
    @GET("forecast?")
    fun getForecast(@Query("latitude") latitude: Double, @Query("longitude") longitude: Double): Call<Any>

}