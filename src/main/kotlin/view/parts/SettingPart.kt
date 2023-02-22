package view.parts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import modules.interfaces.views.View

class SettingPart: View {

    @Composable
    override fun app() {
        Box(modifier = Modifier
            .background(Color.Blue)
            .fillMaxSize(0.3f)){

        }
    }
}