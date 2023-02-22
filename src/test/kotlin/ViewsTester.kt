
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import modules.views.MainView
import org.junit.jupiter.api.Test

class ViewsTester {

    @Test
    fun main() = application {
        Window(onCloseRequest = ::exitApplication) {
           // MainView(TelemetricView(), TitleView()).app()
            MainView().app()
        }
    }


}