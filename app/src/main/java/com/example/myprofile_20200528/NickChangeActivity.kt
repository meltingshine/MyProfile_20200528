package com.example.myprofile_20200528

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_nick_change.*

class NickChangeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nick_change)

        nickDoneBtn.setOnClickListener {
            val resultIntent = Intent()
            val newNick = changedNickEdt.text.toString()
            resultIntent.putExtra("resultNick","newNick")
            setResult(Activity.RESULT_OK,resultIntent)
            finish()

        }
    }

}
