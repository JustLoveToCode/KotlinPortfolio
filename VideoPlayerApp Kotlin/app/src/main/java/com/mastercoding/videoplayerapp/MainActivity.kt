package com.mastercoding.videoplayerapp

import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import com.mastercoding.videoplayerapp.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // This is getting the VideoView Component with the id
        // of R.id.videoview1 here:
        // VideoView is the Widget that is provided by the
        // Android Framework to display the Video here:
        // It is part of the Android Widget Packages and
        // it is designed to play the videos from the Local
        // Source or from the Network Stream:
        // This is the declaration of variable videoView
        // called the VideoView which is the Widget for Android:
        // Displaying the Video from the LocalStorage:
        val videoView: VideoView =findViewById(R.id.videoview1)
        // Finding the Video Path using setVideoPath:
        videoView.setVideoPath("android.resource://"+packageName+"/"+ R.raw.channel)
        // Creating an Instance of the mediaController:
        val mediaController = MediaController(this)
        // mediaController is attached to the videoView:
        mediaController.setAnchorView(videoView)
        // Inform the MediaController that it should control
        // the playback of the Video Content:
        // Specified the Media Player to be controlled by MediaController:
        // The playback, stop and play will be associated to the videoView:
        mediaController.setMediaPlayer(videoView)
        // Associating the mediaController with the VideoView:
        // Tell videoView that it should use the provided mediaController
        // for displaying the playback controls:
        // Establish the Visual Connections between the mediaController
        // and the videoView: The mediaController such as play, pause
        // will be visually overlaid on top of the videoView:
        videoView.setMediaController(mediaController)
        // Start the Video when the App first run:
        videoView.start()

    }
}