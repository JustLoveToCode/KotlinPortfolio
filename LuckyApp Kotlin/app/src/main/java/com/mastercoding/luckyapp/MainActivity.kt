package com.mastercoding.luckyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Getting the Button Component
        var b1: Button =findViewById(R.id.btn)
        // Getting the TextView Component
        var txt: TextView = findViewById(R.id.textView)
        // Getting the EditText Component
        var editTXT: EditText =findViewById(R.id.editText)
        // Setting the onClickListener on the Button Component
        b1.setOnClickListener(){
        // Getting the text here
            var username=editTXT.text
        //Creating the Explicit Intents Here:
            var i = Intent(this,LuckyNumberActivity::class.java)
        // Passing the Username:
            i.putExtra("name",username)
            startActivity(i)
        }
    }
}