package view.parts

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.awt.SwingPanel
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import controller.Log
import javax.swing.BoxLayout
import javax.swing.JPanel

class DatePickPanel(val log: Log){

    init {
        if (log.firstDate.dateChangeListeners.isNullOrEmpty()) {
            log.firstDate.addDateChangeListener {
                log.firstDate
            }
        }
        if (log.secondDate.dateChangeListeners.isNullOrEmpty()) {
            log.secondDate.addDateChangeListener {
                log.secondDate
            }
        }
    }

    @Composable
    fun app(){


        SwingPanel(
            background = Color.White,
            modifier = Modifier.size(200.dp, 35.dp)
                .fillMaxWidth(),
            factory = {
                JPanel().apply {
                    layout = BoxLayout(this, BoxLayout.Y_AXIS)

                    add(log.firstDate)
                }
            }
        )
        SwingPanel(
            background = Color.White,
            modifier = Modifier.size(200.dp, 35.dp)
                .fillMaxWidth(),
            factory = {
                JPanel().apply {
                    layout = BoxLayout(this, BoxLayout.Y_AXIS)

                    add(log.secondDate)
                }
            }
        )
        Button(onClick= {

        }, Modifier
            .size(120.dp,35.dp)
            .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(Color(215, 227, 252))){
            Text("Logs")
        }
    }

}