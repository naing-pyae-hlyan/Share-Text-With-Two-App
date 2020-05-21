package com.nph.fstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ShareCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_send.setOnClickListener { v -> sendMsgToAnotherApp() }
    }

    private fun sendMsgToAnotherApp() {
        val intent = ShareCompat.IntentBuilder.from(this)
            .setType("text/plain")
            .setText(edit_text.text)
            .intent
        startActivity(intent)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}
