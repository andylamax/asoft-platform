package tz.co.asoft.platform

import android.content.Context
import android.widget.Toast

actual typealias Ctx = Context

actual fun Ctx.alert(msg: Any?) {
    Toast.makeText(this, msg.toString(), Toast.LENGTH_LONG).show()
}