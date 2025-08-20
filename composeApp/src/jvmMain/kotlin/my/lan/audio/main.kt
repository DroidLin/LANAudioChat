package my.lan.audio

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import javax.sound.sampled.AudioFormat
import javax.sound.sampled.AudioSystem
import javax.sound.sampled.DataLine
import javax.sound.sampled.TargetDataLine

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "MyLANAudio",
    ) {
        App()
    }
}