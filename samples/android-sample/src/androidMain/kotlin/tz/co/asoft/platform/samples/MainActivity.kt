package tz.co.asoft.platform.samples

import android.os.Bundle
import android.widget.Toast
import tz.co.asoft.platform.core.Activity
import tz.co.asoft.platform.env.*

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ENV = env()
        Toast.makeText(this, ENV["name"].toString(), Toast.LENGTH_LONG).show()
    }
}