package com.example.myprofile_20200528

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        changeNickBtn.setOnClickListener {
            val myIntent = Intent(this,NickChangeActivity::class.java)
            startActivityForResult(myIntent,"1000")


        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode = 1000){
//            myNicknameTxt.text = data?.
        }

    }
}
