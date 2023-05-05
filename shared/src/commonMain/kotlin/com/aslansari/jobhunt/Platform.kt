package com.aslansari.jobhunt

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform