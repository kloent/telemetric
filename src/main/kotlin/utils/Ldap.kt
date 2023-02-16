package utils

import services.Ldap
import javax.inject.Inject

class Ldap @Inject constructor(retrofit: Retrofit)  {
    val baseUrl: String = PropertyLoader("src/main/resources/configs/rest.properties").getProperty("BASE_URL")
    val client = retrofit.getRetrofitClient(baseUrl)
    val ldap = client.create(Ldap::class.java)

    fun get(){
        val result = ldap.getForecast1().execute()
    }
}