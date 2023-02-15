package utils

import services.Ldap

class Ldap(baseUrl: String = "google.com") {

    val client = Retrofit().getRetrofitClient(baseUrl)
    val ldap = client.create(Ldap::class.java)

    fun get(){
        val result = ldap.getForecast1().execute()
    }
}