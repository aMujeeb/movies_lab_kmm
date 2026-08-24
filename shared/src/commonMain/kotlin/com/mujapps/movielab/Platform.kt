package com.mujapps.movielab

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform