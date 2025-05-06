package com.dasonet.cleaner

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform