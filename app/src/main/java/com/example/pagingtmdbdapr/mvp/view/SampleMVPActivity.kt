package com.example.pagingtmdbdapr.mvp.view

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.pagingtmdbdapr.R
import com.example.pagingtmdbdapr.mvp.presenter.SampleMVPContractor
import com.example.pagingtmdbdapr.mvp.presenter.SampleMVPPresenter

class SampleMVPActivity : AppCompatActivity(),SampleMVPContractor.InterfaceView {
    private val buttonServer : Button by lazy{
        findViewById(R.id.buttonServer) as Button
    }
 val  presenter = SampleMVPPresenter(this@SampleMVPActivity)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_mvp)
        init()
    }


    fun init(){
        buttonServer.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                presenter.serverCall()
            }
        })

    }

    override fun showDialog(message: String) {
        TODO("Not yet implemented")
    }

}