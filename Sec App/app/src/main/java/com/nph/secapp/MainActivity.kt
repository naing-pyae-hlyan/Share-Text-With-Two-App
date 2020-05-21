package com.nph.secapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ShareCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intentReader = ShareCompat.IntentReader.from(this)
        if (intentReader.isShareIntent){
            txt_receive.text = intentReader.text
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}
