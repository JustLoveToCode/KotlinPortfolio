package com.mastercoding.counterapp


import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    // Set the initial counter which is int to 0:
    var counter: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // activity_main.xml file: This is the activity_main
        // that have the TextView and the Button Component:
        setContentView(R.layout.activity_main)

        // Step 2:
        // Getting the btn which is Button Component
        // using the findViewById(R.id.btn)
        val btn: Button = findViewById(R.id.btn)
        // Getting the result_txt which is TextView Component
        // using the findViewById(R.id.result_text) to get
        // the TextView Component here:
        val result_txt: TextView =findViewById(R.id.result_text)

        // Step 3: Adding the Functionalities:
        btn.setOnClickListener(){
            result_txt.setText(""+increaseCounter())
        }

    }
    // Creating the function to increaseCounter
    fun increaseCounter(): Int{
        counter++
        return counter
    }
}