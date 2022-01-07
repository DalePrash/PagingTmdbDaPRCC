package com.example.pagingtmdbdapr.launchmode

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.pagingtmdbdapr.R

public class LaunchModeAAA : AppCompatActivity() {

    private val buttonA : Button by lazy{
        findViewById(R.id.buttonLaunchA) as Button
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState )
        setContentView(R.layout.activity_launch_mode_aa)
        buttonA.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                val intent = Intent()
                intent.action= "launchb"
              //  intent.flags=  Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_SINGLE_TOP
                startActivity(intent)
            }
        })
    }

}