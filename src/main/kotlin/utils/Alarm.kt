package utils

import javax.sound.sampled.*


class Alarm {
    val audioFilePath = "audio/alarm.wav"

    var inputStream = javaClass.classLoader.getResourceAsStream(audioFilePath)
    var audioStream = AudioSystem.getAudioInputStream(inputStream)
    var audioFormat: AudioFormat = audioStream.format
    var info = DataLine.Info(SourceDataLine::class.java, audioFormat)
    val audioClip = AudioSystem.getLine(info)
    val clip = AudioSystem.getClip()

    fun main(){
        audioClip.addLineListener(SoundPlayerUsingClip())
        clip.open(audioStream)
        clip.start()
    }

    fun finish(){
        clip.close();
        audioStream.close();
    }

    class SoundPlayerUsingClip : LineListener {
        var isPlaybackCompleted = false
        override fun update(event: LineEvent) {
            if (LineEvent.Type.START === event.type) {
                println("Playback started.")
            } else if (LineEvent.Type.STOP === event.type) {
                isPlaybackCompleted = true
                println("Playback completed.")
            }
        }
    }
}