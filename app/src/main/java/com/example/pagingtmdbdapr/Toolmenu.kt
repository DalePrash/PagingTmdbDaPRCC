package com.example.pagingtmdbdapr

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_constraint_practise.*
import kotlinx.android.synthetic.main.activity_tool_menu.*

public class Toolmenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tool_menu_b)
       // setSupportActionBar(toolbarMenu)
       // android:theme="@style/AppTheme.NoActionBar" in manifest

        setSupportActionBar( findViewById(R.id.toolbarMenu))
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar()?.setDisplayShowHomeEnabled(true);


        //       app:popupTheme="@style/ThemeOverlay.AppCompat.Light"
        supportActionBar?.apply {
            // Set toolbar title/app title
            title = "Toolbar Title"

            // Set action bar/toolbar sub title
            subtitle = "Toolbar sub title"

            // Display the app icon in action bar/toolbar
            setDisplayShowHomeEnabled(true)
            setLogo(R.mipmap.ic_launcher)
            setDisplayUseLogoEnabled(true)
        }
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        val inflater = menuInflater
        inflater.inflate(R.menu.toolbar_menu, menu)

        return super.onCreateOptionsMenu(menu)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle presses on the action bar menu items
        when (item.itemId) {
// for back buton below 
            android.R.id.home->{

                val intent = Intent()
                intent.action= "launcha"
                startActivity(intent)
                return true

            }


            R.id.action_cut -> {
                textView.text = "Cut Clicked."
                return true
            }
            R.id.action_copy -> {
                textView.text = "Copy Clicked."
                return true
            }
            R.id.action_paste -> {
                textView.text = "Paste Clicked."
                return true
            }
            R.id.action_new -> {
                textView.text = "New Clicked."
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

}