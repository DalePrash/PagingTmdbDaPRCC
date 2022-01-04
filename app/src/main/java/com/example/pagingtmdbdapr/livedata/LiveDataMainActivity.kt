package com.example.pagingtmdbdapr.livedata

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.pagingtmdbdapr.R
import kotlinx.android.synthetic.main.activity_live_data.*

public class LiveDataMainActivity : AppCompatActivity() {

    // belwo cant be var
    val buttonA : Button by lazy {
        findViewById(R.id.buttonLiveData) as Button
    }


    lateinit var viewModel : LiveDataViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data)
  buttonA.setOnClickListener(object :View.OnClickListener{
      override fun onClick(p0: View?) {
          viewModel.currentNumber.value= ++viewModel.number
          viewModel.currentBoolean.value= viewModel.number %2 ==0

          TODO("Not yet implemented")
      }
  })
        val viewModel = ViewModelProvider(this).get(LiveDataViewModel::class.java)
   viewModel.currentNumber.observe(this, Observer {
       textLiveData.text = it.toString()
   })
        viewModel.currentNumber.observe(this, Observer {
            textBooleanLive.text = it.toString()
        })


    }
    /*
    Activity.    ViewModel
    Value changed if activity is active
     */
}