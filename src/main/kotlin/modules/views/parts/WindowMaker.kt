package modules.views.parts

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.window.Window
import modules.interfaces.views.View
import modules.interfaces.views.parts.Window

class WindowMaker(val isOpened: MutableState<Boolean>): Window {

    @Composable
    fun newWindow(view: View) {
        println("1 ${isOpened.value}")
        if (isOpened.value) {
            Window(onCloseRequest = {
                isOpened.value = false
            }) {
                view.app()
                println("2 ${isOpened.value}")
            }
        }
    }

}