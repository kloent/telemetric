package modules.views.parts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Button
import androidx.compose.material.DropdownMenu
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import modules.interfaces.views.data.Item
import modules.interfaces.views.parts.ItemMenu

class DropDownMenu (itemsList: List<Item>){

    val expanded: MutableState<Boolean> = mutableStateOf(false)
    lateinit var itemsMenu: ItemMenu
    val items: ItemMenuPart =  ItemMenuPart(itemsMenu)

    @Composable
    fun app(){
            Box(modifier = Modifier.fillMaxSize().wrapContentSize(Alignment.TopStart)) {
                Button(onClick = { expanded.value = true },
                    modifier = Modifier,
                ){
                    Text("Setting")
                }

                DropdownMenu(
                    expanded = itemsMenu.expanded.value,
                    onDismissRequest = { itemsMenu.expanded.value = false },
                    modifier = Modifier.background(
                        Color.Gray)
                ) {
                   items.AddItems()
                }
            }
        }

}