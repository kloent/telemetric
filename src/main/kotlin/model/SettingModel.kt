package model

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import modules.utils.PropertyLoader
import utils.Kafka
import utils.Retrofit
import java.io.File

class SettingModel {

    lateinit var file: File
    var KafkaFile: MutableState<File> = mutableStateOf(File(""))
    var RestFile: MutableState<File> = mutableStateOf(File(""))
    val property: PropertyLoader = PropertyLoader()
    val retrofit: Retrofit = Retrofit()
    //val ldap: Ldap = Ldap(retrofit)
    val kafka: Kafka = Kafka()

}