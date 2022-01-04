package com.example.pagingtmdbdapr.kottln

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.pagingtmdbdapr.R
import com.example.pagingtmdbdapr.customview.CustomView
import com.example.pagingtmdbdapr.customview.ImageViewText
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ToConverKotlin : AppCompatActivity {
    private var imageViewText: ImageViewText? = null

    companion object {
        private var button: Button? = null
        private var textX: TextView? = null
        var imageViewTextstatic: ImageViewText? = null
        fun objectofInterface() {
            val apiService = APICl.getClient().create(NetServe::class.java)
            val call = apiService.topRatedMovies

          /*  call.enqueue(object :Callback<Pojo?>{

            }

           */


            call.enqueue(object : Callback<Pojo?> {
                override fun onResponse(call: Call<Pojo?>, response: Response<Pojo?>) {
                    Log.i("a", "a")
                    val thread: Thread = object : Thread() {
                        override fun run() {
                            Log.i("a", "a")
                        }
                    }
                    thread.start()
                }

                override fun onFailure(call: Call<Pojo?>, t: Throwable) {
                    Log.i("a", "a")
                }
            })
        }

        init {
            val k = 11
            val s = "gggg"
        }
    }

    constructor() {}
    protected constructor(data: String?) {}
    private constructor(data: String, ku: Int, k: ImageViewText) : this(data) {
        imageViewText = k
     //   super.bindService(null, null, 0)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
    }

    fun nonStatic() {}
    fun StaticMeth() {
        imageViewTextstatic = ImageViewText(null, null)
        button = findViewById(R.id.buttonGetMovie)
        textX = findViewById(R.id.textView3)
        textX?.setOnClickListener(View.OnClickListener { view: View? ->
            val intent = Intent(this@ToConverKotlin, CustomView::class.java)
            startActivity(intent)
        })
    }
}