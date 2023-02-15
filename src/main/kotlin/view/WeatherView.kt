package view

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import interfaces.View

class WeatherView: View {

    @Preview
    @Composable
    override fun app(){

        Box(modifier = Modifier
            ) {
            Box{
                Column {

                    Text("end Column")
                }
            }

            Box(modifier = Modifier
                .align(alignment = Alignment.BottomCenter)
                .padding(vertical = 150.dp))
            {
                Text("Second")
            }
        }
        hello()
    }

    @Composable
    fun hello(){
        Box(modifier = Modifier
            .padding(vertical = 150.dp)
        ){
            Text("Hello")
        }
    }
}