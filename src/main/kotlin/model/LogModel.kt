package model

import utils.Ldap
import utils.Retrofit

class LogModel {

    val retrofit: Retrofit = Retrofit()
    val ldap: Ldap = Ldap(retrofit)

}