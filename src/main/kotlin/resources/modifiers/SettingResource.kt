package modifiers

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class SettingResource {

    val Box: Modifier = Modifier
        .background(Color.LightGray)
        .padding(30.dp)
        .fillMaxSize()
    val Row: Modifier = Modifier
        .background(Color.Magenta)
        .padding(30.dp)
        .fillMaxWidth()
    val Text: Modifier = Modifier
        .padding(15.dp)
}