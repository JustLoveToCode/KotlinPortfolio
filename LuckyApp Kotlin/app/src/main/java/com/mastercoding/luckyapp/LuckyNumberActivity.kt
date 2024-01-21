package com.mastercoding.luckyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.Random


class LuckyNumberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lucky_number)

        val text1: TextView = findViewById(R.id.text1)
        val luckyText:TextView=findViewById(R.id.luckyNumTxt)
        val shareBtn: Button =findViewById(R.id.shareBtn)

        var user_name = receiveUserName()


        var random_num = generateRandomNum()

        luckyText.setText("" + random_num)

        shareBtn.setOnClickListener(){
            shareData(user_name,random_num)
        }

    }
    // Receiving the username Function:
    fun receiveUserName():String{
        var bundle:Bundle?=intent.extras
        var username = bundle?.get("name").toString()
        return username
    }
    // Generate the Random Number Function:
    fun generateRandomNum():Int{
        // Create an Instance of the Random class:
        // nextInt(1000) Invoke the nextInt method
        // it will generate the random number from 0 to 1000:
        val random = Random().nextInt(1000)
        return random

    }

    // Sharing the Username and the Number
    fun shareData(username:String,num:Int){
        // Implicit Intent to share Data to the External Sources:
        var i = Intent(Intent.ACTION_SEND)
        i.setType("text/plain")
        i.putExtra(Intent.EXTRA_SUBJECT,"$username+is lucky today")
        i.putExtra(Intent.EXTRA_TEXT, "His Lucky Number is $num")
        startActivity(i)
    }

}