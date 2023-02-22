package view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import modules.interfaces.views.View

class TelemetricView: View {

    var text: MutableList<String> = mutableListOf<String>("1st sdasd","2nd asdasdasd"," 3th 1213123")

    @Composable
    override fun app() {

        LazyColumn(modifier = Modifier
            .background(color= Color(170,170,170))
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(5.dp)){
            items(text){
                    Text(it)
            }
        }
    }



}