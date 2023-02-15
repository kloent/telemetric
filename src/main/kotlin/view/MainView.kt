package view

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import interfaces.View

class MainView(val view: View = TelemetricView()):View {

    @Preview
    @Composable
    override fun app() {
        MaterialTheme {
            Column(){
                TitleView().app()
                view.app()
            }
        }
    }
}