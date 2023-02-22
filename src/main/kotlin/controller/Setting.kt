package controller

import model.SettingModel
import modules.views.parts.FileChooser

class Setting {
    val model: SettingModel = SettingModel()

    fun actionListener(fileChooser: FileChooser, name: String) {

        fileChooser.chooser.addActionListener { e->
            if (e.actionCommand.equals("ApproveSelection")) {
                if (name == "Kafka") {
                    model.KafkaFile.value = fileChooser.chooser.selectedFile
                }
                if (name == "Rest"){
                    model.RestFile.value = fileChooser.chooser.selectedFile
                }

            }
        }
    }
}