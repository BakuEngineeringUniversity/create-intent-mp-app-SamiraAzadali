package com.example.intentpractice

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val name = intent.getStringExtra("NAME")

        val textView = findViewById<TextView>(R.id.userText)

        textView.text = "Hello $name!"


        val nextButton = findViewById<Button>(R.id.buttonNextToPlayMusic)
        nextButton.setOnClickListener {

            mediaPlayer = MediaPlayer.create(this, R.raw.music)
            mediaPlayer?.start()
        }
    }
}
