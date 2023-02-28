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
                    model.savePath(name,fileChooser.chooser.selectedFile.path)
                }
                if (name == "Rest"){
                    model.RestFile.value = fileChooser.chooser.selectedFile
                    model.savePath(name,fileChooser.chooser.selectedFile.path)
                }

            }
        }
    }


}