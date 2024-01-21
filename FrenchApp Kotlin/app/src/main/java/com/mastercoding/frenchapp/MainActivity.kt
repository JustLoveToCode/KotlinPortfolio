package com.mastercoding.frenchapp

import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Your Code for the Main Activity:

    }
    // To Invoke the Button Click:
    public fun SayTheColor(view: View){
        // Type Casting Method Here:
        val clickedButton: Button = view as Button
        // This is the mediaPlayer variable that is
        // of the type MediaPlayer:
        var mediaPlayer: MediaPlayer=MediaPlayer.create(this,
            // Methods in the Android Development:
            // to obtain the resource identifier for the
            // given resources name and the type
            // Dynamically used to access the resources
            // such as the layouts, drawable,strings and more:
            // In this case, it is getting the tag of the clickedButton:
            // "raw" Folder specify that you are looking for the raw folder:
            // packageName is actually the Name of the Package:
            resources.getIdentifier(
                clickedButton.tag.toString(),
                "raw",packageName
            )
            )

        // Starting the mediaPlayer here:
        mediaPlayer.start()

    }
}