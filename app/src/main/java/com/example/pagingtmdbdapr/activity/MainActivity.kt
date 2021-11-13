package com.example.pagingtmdbdapr.activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.pagingtmdbdapr.R
import com.example.pagingtmdbdapr.pojo.MovieList
import com.example.pagingtmdbdapr.service.NetworkService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        serviceCallB()
    }
/*
    fun serviceCall() {
        //    val networkService = com.example.pagingtmdbdapr.service.NetworkService()
        val networkService = NetworkService.getService()

        networkService.getMovies()
            .subscribe(
                { response ->
                    Log.i("aa", "aaa")


                },
                {
                    Log.i("aa", "aaa")

                })


    }

 */
    // https://api.themoviedb.org/3/movie/top_rated?api_key=b199eab06bc931ed71cd20c95e4b2bb3


    fun serviceCallB() {
        val networkService = NetworkService.getService()
        val callx = networkService.getMovies()
        callx.enqueue(object :Callback<MovieList>{
            override fun onResponse(call: Call<MovieList>, response: Response<MovieList>) {
                Log.d("aaa", "Number of movies received: " )
            }

            override fun onFailure(call: Call<MovieList>, t: Throwable) {
                Log.d("aaa", "Number of movies received: " )
            }

        })


    }
}