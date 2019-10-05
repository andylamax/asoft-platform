package tz.co.asoft.platform

import kotlin.browser.window

actual abstract class Ctx

actual fun Ctx.alert(msg: Any?) {
    window.alert(msg.toString())
}