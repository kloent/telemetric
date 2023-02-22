package modules.views.parts

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import modules.interfaces.views.View
import java.awt.Container
import javax.swing.JFileChooser
import javax.swing.filechooser.FileNameExtensionFilter

class FileChooser: View {

    val chooser = JFileChooser()
    val filter = FileNameExtensionFilter("Property files", "properties")

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
        println(chooser.actionListeners)
        this.chooser.fileFilter = filter
        val returnVal = this.chooser.showOpenDialog(Container().parent)
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            println("You chose to open this file: " +
                    chooser.selectedFile.path)

        }
        return
    }


}