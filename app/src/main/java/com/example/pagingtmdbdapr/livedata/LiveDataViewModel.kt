package com.example.pagingtmdbdapr.livedata

import android.os.CountDownTimer
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LiveDataViewModel : ViewModel() {

    private lateinit var timer: CountDownTimer
    private val _seconds = MutableLiveData<Int>()
   var number = 0
     val currentNumber : MutableLiveData<Int> by lazy {
         MutableLiveData<Int>()
     }

    val currentBoolean : MutableLiveData<Boolean> by lazy {
        MutableLiveData<Boolean>()
    }


    fun seconds() : LiveData<Int>{
        return _seconds
    }

    fun startTimer()
    {
        timer = object : CountDownTimer(10000,1000){
            override fun onTick(p0: Long) {
                TODO("Not yet implemented")
            }

            override fun onFinish() {
                TODO("Not yet implemented")
            }
        }
    }

}