package view.parts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class BottomNav {

    val mod: Modifier = Modifier
        .background(Color(215, 227, 252))
        .padding(horizontal = 5.dp)

    @Composable
    fun app(){

        BottomNavigation(contentColor = Color(215, 227, 252),
            backgroundColor = Color.White,
            elevation = 30.dp,
            modifier = Modifier.paddingFromBaseline(bottom = 20.dp)
                .height(30.dp)) {
            BottomNavigationItem(false,
                modifier = mod,
                onClick = {},
                icon = {},
                selectedContentColor = Color.Cyan,
                unselectedContentColor = Color.Gray,
                label = { Text("1 day") })
            BottomNavigationItem(false,
                modifier = mod,
                onClick = {},
                icon = {},
                selectedContentColor = Color.Cyan,
                unselectedContentColor = Color.Gray,
                label = { Text("7 days") })
            BottomNavigationItem(false,
                modifier = mod,
                onClick = {},
                icon = {},
                selectedContentColor = Color.Cyan,
                unselectedContentColor = Color.Gray,
                label = { Text("1 month") })
            BottomNavigationItem(false,
                modifier = mod,
                onClick = {},
                icon = {},
                selectedContentColor = Color.Cyan,
                unselectedContentColor = Color.Gray,
                label = { Text("1 Year") })

        }
    }
}