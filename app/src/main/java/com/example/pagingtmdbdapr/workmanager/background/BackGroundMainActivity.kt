package com.example.pagingtmdbdapr.workmanager.background

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.pagingtmdbdapr.R

public class BackGroundMainActivity : AppCompatActivity() {

    private val buttonStart : Button by lazy{
        findViewById(R.id.buttonBackgroundStart) as Button
    }
    private val buttonStop : Button by lazy{
        findViewById(R.id.buttonBackgroundStop) as Button
    }
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_background_music)
        buttonStart.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                // startService(new Intent(this,BackGroundMusicService.class))
                TODO("Not yet implemented")
                startService(Intent(this@BackGroundMainActivity, BackGroundMusicService::class.java))

            }
        })

        buttonStop.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                TODO("Not yet implemented")
                stopService(Intent(this@BackGroundMainActivity, BackGroundMusicService::class.java))

            }
        })
   /*
        val player = MediaPlayer.create(this, BassBoost.Settings.S)
          player.setLooping(true)
        player.start()

    */

    }

}