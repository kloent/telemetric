package view

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import interfaces.View
import utils.Alarm

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
    }

    @Composable
    fun dropdownMenu(){
        val expanded = remember { mutableStateOf(false) }
        val items = listOf("A", "B", "C", "D", "E", "F")
        val selectedIndex = remember { mutableStateOf(0) }

        Box(modifier = Modifier.fillMaxSize().wrapContentSize(Alignment.TopStart)) {
            Text(
                items[selectedIndex.value],
                modifier = Modifier.width(90.dp).clickable(onClick = { expanded.value = true }).background(
                    Color.Gray,
                ),
            )
            DropdownMenu(
                expanded = expanded.value,
                onDismissRequest = { expanded.value = false },
                modifier = Modifier.fillMaxHeight(0.6f).background(
                    Color.Red)
            ) {
                items.forEachIndexed { index, s ->
                    DropdownMenuItem(onClick = {
                        selectedIndex.value = index
                        expanded.value = false
                    }) {

                        Text(text = s)
                    }
                }
            }
        }

    }
}