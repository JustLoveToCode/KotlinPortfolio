package com.mastercoding.unitconverterapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // The Start of the Code:
        // Getting the EditText, Button and the
        // TextView to get all the Different Components:
        val edt : EditText =findViewById(R.id.kilo_edt)
        val btn : Button = findViewById(R.id.btn)
        val resultText: TextView =findViewById(R.id.result_text)

        btn.setOnClickListener(){
            // Transforming toString() and then toDouble() Here:
            val kilos: Double = edt.text.toString().toDouble()
            // Using the setText Method to set the text here:
            resultText.setText("" + convertToPounds(kilos) + "\nPounds")
        }

    }
    // Creating the convertToPounds Function that take in the kilos
    // of the type Double:
    fun convertToPounds(kilos: Double):Double{
        var pounds = kilos * 2.20
        // return keyword allowed you to return the pounds back
        // to the convertToPounds() when the function is being invoked
        return pounds
    }
}

