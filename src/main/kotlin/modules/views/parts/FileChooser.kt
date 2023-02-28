package modules.views.parts

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import modules.interfaces.views.View
import java.awt.Container
import javax.swing.JFileChooser
import javax.swing.filechooser.FileNameExtensionFilter

class FileChooser: View {

    val chooser = JFileChooser()
    val filter = FileNameExtensionFilter("Property files", ".properties")

    @Composable
    override fun app() {

            val text = "Chose file"
            Button(onClick = {
                createDialog()
            }, colors = ButtonDefaults.buttonColors(Color(171, 196, 255)),
            modifier = Modifier.fillMaxWidth(0.3f)
                .padding(horizontal = 20.dp)) {
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
    }


}