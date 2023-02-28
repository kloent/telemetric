package model

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import modules.utils.PropertyLoader
import java.io.File

class SettingModel {

    var property: PropertyLoader = PropertyLoader("src/main/resources/configs")
    var KafkaFile: MutableState<File> = mutableStateOf(File(""))
    var RestFile: MutableState<File> = mutableStateOf(File(""))


    init {
        property.setPropertyFile()
        if(property.getProperty("Kafka").isNotEmpty()) {
            KafkaFile.value = File(property.getProperty("Kafka"))
        }
        if(property.getProperty("Rest").isNotEmpty()) {
            RestFile.value = File(property.getProperty("Rest"))
        }
    }

    fun savePath(name: String,path: String) {
        property.addProperty(name,path)
        property.saveProperty()

    }
}