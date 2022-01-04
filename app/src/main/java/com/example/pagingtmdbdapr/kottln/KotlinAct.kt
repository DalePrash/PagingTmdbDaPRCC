package com.example.pagingtmdbdapr.kottln

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pagingtmdbdapr.R

public class KotlinAct : AppCompatActivity {
constructor(data:String){
}
    constructor(data:String,vv:Int){
      //  this(data)
    }
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_kotlin)
    }
}