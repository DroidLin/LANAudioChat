package my.lan.audio.service

interface VoiceDataSource {

    fun read(bytes: ByteArray, start: Int, end: Int): Int
}