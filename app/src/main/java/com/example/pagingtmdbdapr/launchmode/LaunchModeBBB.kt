package com.example.pagingtmdbdapr.launchmode

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.pagingtmdbdapr.R

public class LaunchModeBBB : AppCompatActivity() {

    private val buttonB : Button by lazy{
        findViewById(R.id.buttonLaunchB) as Button
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState, )
        setContentView(R.layout.activity_launch_mode_bb)
        buttonB.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                val intent = Intent()
                intent.action= "launchc"
                startActivity(intent)
            }
        })
    }

}