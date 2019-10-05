package tz.co.asoft.platform

actual abstract class Ctx

actual fun Ctx.alert(msg: Any?) {
    println(msg)
}