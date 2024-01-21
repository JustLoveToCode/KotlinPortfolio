package com.mastercoding.greetingapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // This is Setting the content for the activity_main
        setContentView(R.layout.activity_main)
        // Declaring Views:
        // This is the edt and btn which have the EditText and Button
        // using the findViewById where you are extracting the id and button:
        val edt : EditText = findViewById(R.id.edt)
        val btn : Button = findViewById(R.id.button)

        btn.setOnClickListener(){
            // Obtaining the text from the EditText Component
            var entered_text = edt.text
            Toast.makeText(
                this, "Hello" + entered_text,
                Toast.LENGTH_LONG
            ).show()
        }

    }
}
