package com.example.myprofile_20200528

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

        val REQ_FOR_NICK = 1001
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        changeNickBtn.setOnClickListener {
            val myIntent = Intent(this,NickChangeActivity::class.java)
            startActivityForResult(myIntent,REQ_FOR_NICK)


        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode = 1000){
//            myNicknameTxt.text = data?.
        }

    }
}
