package com.example.myprofile_20200528

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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

        dialBtn.setOnClickListener {
            val myNum = dialEdt.text.toString()
            val myUri = Uri.parse("tel:${myNum}")
            val myIntent = Intent(Intent.ACTION_DIAL, myUri)
            startActivity(myIntent)
        }

        smsSendBtn.setOnClickListener {
            val myNum = dialEdt.text.toString()
            val myContent = smsContentEdt.text.toString()
            val myUri = Uri.parse("smsto:${myNum}")
            val myIntent = Intent(Intent.ACTION_SENDTO,myUri)
            myIntent.putExtra("sms_body",myContent)
            startActivity(myIntent)



        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == REQ_FOR_NICK){
//            뭐때문에 갔니
            if(resultCode == Activity.RESULT_OK) {
//                확인해서 돌아온게 맞니
                val nickName = data?.getStringExtra("nick")
                //get자료형Extra
                myNicknameTxt.text = nickName
                Toast.makeText(this,"닉네임변경완료",Toast.LENGTH_SHORT).show()

            }
        }

    }
}
