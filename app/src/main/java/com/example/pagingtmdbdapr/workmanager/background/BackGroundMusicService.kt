package com.example.pagingtmdbdapr.workmanager.background

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

public class BackGroundMusicService:Service() {
// declare  in manifest
    lateinit var player:MediaPlayer
    override fun onBind(p0: Intent?): IBinder? {
        TODO("Not yet implemented")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
       // return super.onStartCommand(intent, flags, startId)

        /*
        val player = MediaPlayer.create(this, BassBoost.Settings.S)
          player.setLooping(true)
        player.start()

    */
        return START_STICKY;


    }

    override fun onDestroy() {
        super.onDestroy()
        player.stop()
    }
}