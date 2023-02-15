package services

import retrofit2.Call
import retrofit2.http.GET

interface Ldap {
    @GET("")
    fun getForecast1(): Call<Any>

}