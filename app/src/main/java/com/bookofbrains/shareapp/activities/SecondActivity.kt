package com.bookofbrains.shareapp.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bookofbrains.shareapp.R
import com.bookofbrains.shareapp.utils.showToast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle: Bundle? = intent.extras

        bundle?.let {
            val message = bundle.getString("user_message")?:""
            showToast(message)
            txtShowMessage.text = message
        }
    }
}
