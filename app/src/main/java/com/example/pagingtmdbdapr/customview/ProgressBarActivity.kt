package com.example.pagingtmdbdapr.customview

import android.app.ProgressDialog
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.pagingtmdbdapr.R


public class ProgressBarActivity : AppCompatActivity() {
    private val button : Button by lazy{
        findViewById(R.id.buttonForProgress) as Button
    }
lateinit var progressDialog: ProgressDialog
lateinit var progressBar:ProgressBar
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
  setContentView(R.layout.activity_progress_bar)
  button.setOnClickListener(object : View.OnClickListener {
      override fun onClick(p0: View?) {
          progressDialog = ProgressDialog(this@ProgressBarActivity)
          progressDialog.setMessage("Loading...") // Setting Message

          progressDialog.setTitle("ProgressDialog") // Setting Title

          progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER) // Progress Dialog Style Spinner

          progressDialog.show() // Display Progress Dialog

          progressDialog.setCancelable(false)
          Thread {
              try {
                  Thread.sleep(10000)
              } catch (e: Exception) {
                  e.printStackTrace()
              }
              progressDialog.dismiss()
          }.start()
      }
  })
    }

    fun newProgress(){
        // ???FindViewById
        val layout = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.progressConstraint) //specify here Root layout Id
        progressBar = ProgressBar(this@ProgressBarActivity, null, android.R.attr.progressBarStyleLarge)
        val params = RelativeLayout.LayoutParams(100, 100)
        params.addRule(RelativeLayout.CENTER_IN_PARENT)
        layout.addView(progressBar, params)

        progressBar.setVisibility(View.VISIBLE);
    }

}