package view.data

import interfaces.Item

data class ItemData(override val name: String, override val index: Int): Item {
    override fun onClick() {
        println("Start")
    }
}