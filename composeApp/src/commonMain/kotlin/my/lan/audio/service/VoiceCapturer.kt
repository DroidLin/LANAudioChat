package my.lan.audio.service

interface VoiceCapture {

    /**
     *
     */
    fun startCapture(voiceConsumer: VoiceConsumer): VoiceCaptureDispose

    fun stopCaptureAll(): Boolean
}