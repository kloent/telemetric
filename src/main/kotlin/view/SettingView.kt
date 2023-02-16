package view

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import interfaces.View
import java.awt.Container
import javax.swing.JFileChooser
import javax.swing.filechooser.FileNameExtensionFilter


class SettingView: View {

    @Composable
    override fun app() {
        val text = "Chose file"
        Button(onClick = {
                createDialog()
        }){
                Text(text)
        }

    }

    private fun createDialog(){
        val chooser = JFileChooser()
        val filter = FileNameExtensionFilter(
            "Property files", "properties")
        chooser.fileFilter = filter
        val returnVal = chooser.showOpenDialog(Container().parent)
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            println("You chose to open this file: " +
                    chooser.selectedFile.path)
        }
    }

}