package view.data

import modules.interfaces.views.View
import modules.interfaces.views.data.Item

data class SettingData(override val name: String, override val view: View): Item {

}