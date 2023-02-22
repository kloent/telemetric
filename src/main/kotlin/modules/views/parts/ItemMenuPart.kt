package modules.views.parts

import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import modules.interfaces.views.parts.ItemMenu

class ItemMenuPart(val itemsMenu: ItemMenu) {

    val selectedIndex: MutableState<Int> = mutableStateOf(0)

    @Composable
    fun AddItems(){

        itemsMenu.itemsList.forEachIndexed { index, s ->
            DropdownMenuItem(onClick = {
                itemsMenu.expanded.value = false
                selectedIndex.value = index

            }) {

                Text(s.name)
            }

        }

    }

    @Composable
    fun OnClick(){

            itemsMenu.itemsList[selectedIndex.value].view.app()
    }

}