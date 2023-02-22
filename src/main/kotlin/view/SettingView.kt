package view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import controller.Setting
import modules.interfaces.views.View
import modules.views.parts.FileChooser

class SettingView(): View {

    lateinit var fileChooser:FileChooser
    val controller: Setting = Setting()

    @Composable
    override fun app() {

        Box(modifier = Modifier
            .background(Color.Gray)
            .fillMaxSize()){
            Column {
                Row {
                    Text("Kafka Property")
                    fileChooser = FileChooser()
                    controller.actionListener(fileChooser,"Kafka")
                    fileChooser.app()
                    Text(controller.model.KafkaFile.value.path, modifier = Modifier.background(Color.Blue).padding(20.dp))
                }
                Row {
                    Text("Rest Property")
                    fileChooser = FileChooser()
                    controller.actionListener(fileChooser,"Rest")
                    fileChooser.app()
                    Text(controller.model.RestFile.value.path, modifier = Modifier.background(Color.Blue).padding(20.dp))
                }
            }

        }

    }

}