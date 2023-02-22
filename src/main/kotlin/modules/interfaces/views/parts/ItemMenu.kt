package modules.interfaces.views.parts

import androidx.compose.runtime.MutableState
import modules.interfaces.views.data.Item

interface ItemMenu {

    var itemsList: List<Item>
    var expanded: MutableState<Boolean>


}