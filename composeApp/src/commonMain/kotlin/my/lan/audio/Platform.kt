package my.lan.audio

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform