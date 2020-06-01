package com.example.myprofile_20200528

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_nick_change.*

class NickChangeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nick_change)
        val nick = intent.getStringExtra("nowNickname")
        changedNickEdt.setText(nick)
//
//        var nowNickname = myNicknameTxt.text.toString()
//        if(nowNickname != "본인닉네임표시") {
//
//            changedNickEdt.text = nowNickname
//        }

        okBtn.setOnClickListener {
            val newNickName = changedNickEdt.text.toString()

            val resultIntent = Intent()
//            왕복 티켓은 비어있는 인텐트다
            resultIntent.putExtra("nick",newNickName)
            setResult(Activity.RESULT_OK,resultIntent)
            finish()


//            나의 오답
//            val resultIntent = Intent()
//            val newNick = changedNickEdt.text.toString()
//            resultIntent.putExtra("resultNick","newNick")
//            setResult(Activity.RESULT_OK,resultIntent)
//            finish()

        }
    }

}
