
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.junit.jupiter.api.Test
import view.LogsView

class ViewsTester {

    @Test
    fun main() = application {
        Window(onCloseRequest = ::exitApplication) {
           // MainView(TelemetricView(), TitleView()).app()
            LogsView().app()
        }
    }


}