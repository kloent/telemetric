package view.parts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Button
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import interfaces.Item

class DropDownMenu(){

    @Composable
    fun app(itemsList: List<Item>, selectedIndex: MutableState<Int>, expanded: MutableState<Boolean>){

            Box(modifier = Modifier.fillMaxSize().wrapContentSize(Alignment.TopStart)) {
                Button(onClick = { expanded.value = true },
                    modifier = Modifier,
                ){
                    Text("Setting")
                    itemsList[selectedIndex.value]
                }
                DropdownMenu(
                    expanded = expanded.value,
                    onDismissRequest = { expanded.value = false },
                    modifier = Modifier.background(
                        Color.Gray)
                ) {
                    AddItems(itemsList ,selectedIndex,expanded)
                }
            }
        }

    @Composable
    fun AddItems(items: List<Item> ,selectedIndex: MutableState<Int>,expanded: MutableState<Boolean>){
        items.forEachIndexed { index, s ->
            DropdownMenuItem(onClick = {
                selectedIndex.value = index
                expanded.value = false
                items[selectedIndex.value].onClick()
            }) {
                Text(s.name)
            }
        }
    }
}