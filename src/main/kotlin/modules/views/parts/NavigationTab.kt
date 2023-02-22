package modules.views.parts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.material.NavigationRail
import androidx.compose.material.NavigationRailItem
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import modules.views.data.ItemsData

class NavigationTab(private val itemsData: ItemsData) {

    private var _currentItem: MutableState<Int> = mutableStateOf(0)

    @Composable
    fun app(){
    Row {
        NavigationRail(
            modifier = Modifier.background(
                Color.Gray)
        ) {

            itemsData.itemsList.forEachIndexed { index, item ->
                when (item) {
                    itemsData.itemsList[index] ->
                        NavigationRailItem(
                            selected = _currentItem.value == index,
                            onClick = { _currentItem.value = index },
                            selectedContentColor = Color.Blue,
                            unselectedContentColor = Color.Gray,
                            icon = { },
                            label = { Text(item.name) }
                        )

                }
            }
        }
        itemsData.itemsList[_currentItem.value].view.app()
    }

    }

}