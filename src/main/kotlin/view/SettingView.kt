package view

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import controller.Setting
import modules.interfaces.views.View
import modules.views.parts.FileChooser

class SettingView(): View {

    lateinit var fileChooser:FileChooser
    val controller: Setting = Setting()
    @Preview
    @Composable
    override fun app() {

        Box(modifier = Modifier
            .background(Color(237, 242, 251))
            .fillMaxSize()
            .padding(15.dp)){
            Column() {
                Row(horizontalArrangement = Arrangement.SpaceAround) {

                        Text("Kafka Property",
                        Modifier.align(Alignment.CenterVertically)
                            .fillMaxWidth(0.1f))

                                fileChooser = FileChooser()
                                controller.actionListener(fileChooser, "Kafka")
                                fileChooser.app()

                        Text(controller.model.KafkaFile.value.path,
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .fillMaxWidth())

                }
                Row(horizontalArrangement = Arrangement.SpaceAround) {

                    Text("Rest Property",
                        Modifier.align(Alignment.CenterVertically)
                            .fillMaxWidth(0.1f))

                                fileChooser = FileChooser()
                                controller.actionListener(fileChooser,"Rest")
                                fileChooser.app()

                    Text(controller.model.RestFile.value.path,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .fillMaxWidth())
                }
            }

        }

    }

}