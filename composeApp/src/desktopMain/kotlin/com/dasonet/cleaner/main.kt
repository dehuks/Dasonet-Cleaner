package com.dasonet.cleaner

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Dasonet_Cleaner",
    ) {
        App()
    }
}