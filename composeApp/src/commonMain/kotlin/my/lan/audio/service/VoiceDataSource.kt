package my.lan.audio.service

interface VoiceDataSource {

    /**
     * try get data from platform-based implementation
     */
    fun read(bytes: ByteArray, start: Int, length: Int): Int
}