package com.mastercoding.sharedpreferencesapp


import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    // Defining the TextView Component
    // which is of the type name_textView here
    // using the lateinit keyword:
    lateinit var name_textView:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Using the setContentView with the R.layout.activity_main.xml file:
        setContentView(R.layout.activity_main)
        // Create the EditText Component with the editText Variable Here:
        val editText: EditText =findViewById(R.id.editText)
        // Create the TextView Component with the name_textView Variable Here:
        name_textView = findViewById(R.id.textViewName)
        // Create the Button Component with the btn Variable Here:
        val btn : Button =findViewById(R.id.btn)
        // Using the setOnClickListener on the btn which is of Button Component:

        DisplaySavedName()
        btn.setOnClickListener(){
            // Variable that is called enteredText Variable of type String:
            // Getting the editText of type text and convert it to the String Format
            // using the toString() Method:
            val enteredText:String = editText.text.toString()
            // Invoking the Function here:
            SaveNameInSharedPref(enteredText)
        }




    }

    private fun SaveNameInSharedPref(enteredText:String){
        // Save the Text into the Shared Pref:
        val sharedPreferences : SharedPreferences =
            // We save in the file called the UserName:
            getSharedPreferences("UserName",
                MODE_PRIVATE
            )

        // Writing the Data to the shared pref
        // using the editor Variable
        val editor: SharedPreferences.Editor =
            sharedPreferences.edit()

        editor.putString("name",enteredText)
        editor.commit()

    }

    // Reading the Data from Shared Preferences:
    // It will display the Last Saved User when you close
    // and open the Mobile App:
    fun DisplaySavedName(){
        val sharedPreferences: SharedPreferences = getSharedPreferences(
            "UserName", MODE_PRIVATE
        )
        val s1: String? = sharedPreferences.getString(
            "name", ""
        )

        name_textView.setText(s1)

    }
}

