package view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import controller.Log
import modules.interfaces.views.View
import view.parts.BottomNav
import view.parts.DatePickPanel
import java.util.*


class LogsView: View {

    val log:Log = Log()
    val mod = Modifier


    @Composable
    override fun app() {

        Column {

            BottomNav().app()

            Row (Modifier.fillMaxWidth()
                .padding(bottom = 20.dp),
                horizontalArrangement = Arrangement.SpaceAround){
                DatePickPanel(log).app()
            }

            val time = Calendar.getInstance().time
            for (i in 1..20) {
                if(i%2 == 0) {
                    Text("$time: Test", modifier = Modifier.padding(horizontal = 10.dp).fillMaxWidth())
                }else {
                    Text("$time: Test", modifier = Modifier.padding(horizontal = 10.dp).fillMaxWidth().background(Color.LightGray))
                }
            }

        }
    }
}
