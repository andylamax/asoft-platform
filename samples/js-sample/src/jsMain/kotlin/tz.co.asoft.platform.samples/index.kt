package tz.co.asoft.platform.samples

import tz.co.asoft.platform.env.env

fun main() {
    console.log("works")
    val ENV = env()
    console.log("Environment name: ${ENV["name"]}")
}