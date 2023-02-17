package view

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import interfaces.View
import utils.Alarm
import view.data.ItemData
import view.parts.DropDownMenu

class TitleView: View {

    @Preview
    @Composable
    override fun app() {

        val text = "File"

            Button(onClick = {

                Alarm().main()
            }) {
                Text(text)
            }
        DropDownMenu().app(listOf(ItemData("test",1)), remember{ mutableStateOf(0) }, remember { mutableStateOf(false) })
    }

}