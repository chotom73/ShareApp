package com.bookofbrains.shareapp.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.bookofbrains.shareapp.R
import com.bookofbrains.shareapp.utils.Constants
import com.bookofbrains.shareapp.utils.showToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object MainActivity {
        val TAG: String = this.javaClass.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener {
            Log.i(TAG, "Button is clicked")
            showToast("Button is clicked")
        }

        btnSendToNextActivity.setOnClickListener {
            val message: String = etUserMessage.text.toString()
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

            var intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(Constants.USER_MESSAGE_KEY, message)
            startActivity(intent)
        }

        btnShareToOtherApps.setOnClickListener {
            val intent = Intent();
            intent.action = Intent.ACTION_SEND
            val message: String = etUserMessage.text.toString()

            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent, "Share to:"))
        }

        btnShowHobbiesList.setOnClickListener {
            val intent = Intent(this, HobbiesActivity::class.java)
            startActivity(intent)
        }

    }
}
