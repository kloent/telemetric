// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.remember
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import modules.interfaces.views.data.Item
import modules.views.data.ItemsData
import modules.views.parts.NavigationTab
import view.LogsView
import view.SettingView
import view.TelemetricView
import view.data.SettingData

    fun main() = application {
        Window(onCloseRequest = ::exitApplication) {
            MaterialTheme {

                val main: Item = SettingData("Main", TelemetricView())
                val setting: Item = SettingData("Setting", SettingView())
                val logs: Item = SettingData("Logs", LogsView())
                val itemsData = remember(){ItemsData(listOf(main,logs,setting))}

                NavigationTab(itemsData).app()

            }
        }
    }
