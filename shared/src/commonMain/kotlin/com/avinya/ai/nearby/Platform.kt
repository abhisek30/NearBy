package com.avinya.ai.nearby

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform