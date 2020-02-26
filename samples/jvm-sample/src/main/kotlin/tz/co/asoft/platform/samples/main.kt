package tz.co.asoft.platform.samples

import tz.co.asoft.platform.env.env

fun main() {
    val ENV = env()
    ENV.forEach { println("Env (${it.key}=${it.value})") }
    println("Environment Name: ${ENV["name"]}")
    println("Test: ")
}