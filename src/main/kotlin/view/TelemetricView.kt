package view

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import modules.interfaces.views.View
import java.util.*

class TelemetricView: View {

    var text: MutableList<String> = mutableListOf(": Message telemetry")

    @Composable
    override fun app() {
        for(i in 1..100) {
            text.add("$i")
        }
        LazyColumn(modifier = Modifier
            .background(color= Color(237, 242, 251))
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(15.dp),
        state = rememberLazyListState(),
        reverseLayout = true,){

                    itemsIndexed(text) {key,item ->
                        Row(Modifier
                            .fillMaxWidth()) {

                                val time = Calendar.getInstance().time
                                if (key % 2 == 0) {
                                    Text("$time:  $item", Modifier
                                        .border(0.3.dp, Color.LightGray)
                                        .fillMaxWidth()
                                        .padding(vertical = 0.5.dp))
                                } else {
                                    Text("$time:  $item", Modifier
                                        .border(0.3.dp, Color.LightGray)
                                        .fillMaxWidth()
                                        .padding(vertical = 0.5.dp)
                                        .background(Color.LightGray))
                                }

                    }
                }

        }
    }



}