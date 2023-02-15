package view

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import interfaces.View
import utils.Alarm

class TitleView: View {

    @Preview
    @Composable
    override fun app() {

        var text by remember { mutableStateOf("File") }

            Button(onClick = {
                text = "File"
                Alarm().main()
            }) {
                Text(text)
            }


    }


}