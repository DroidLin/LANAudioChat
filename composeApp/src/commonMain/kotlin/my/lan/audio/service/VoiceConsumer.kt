package my.lan.audio.service

interface VoiceConsumer {

    /**
     * consume data from bytes with the given [start] and [length]
     */
    fun consume(bytes: ByteArray, start: Int, length: Int): Int
}