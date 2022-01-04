package com.example.pagingtmdbdapr.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pagingtmdbdapr.R
import com.example.pagingtmdbdapr.kottln.KotlinAct
import com.example.pagingtmdbdapr.movieroom.ActivityMovieRetrieveCache
import com.example.pagingtmdbdapr.movieroom.MovieDataBase
import com.example.pagingtmdbdapr.movieroom.MovieOrigDao
import com.example.pagingtmdbdapr.pojo.MovieList
import com.example.pagingtmdbdapr.service.NetworkService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


public class MainActivity : AppCompatActivity() {

    private val recyclerView :RecyclerView by lazy{
        findViewById(R.id.recy) as RecyclerView
    }
    private val butonxx : Button by lazy{
        findViewById(R.id.buttonXX) as Button
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView.setLayoutManager(object : LinearLayoutManager(this@MainActivity) {

        })
        serviceCall()

        butonxx.setOnClickListener {
            goTOnextScreen()
        }
    }
    // https://api.themoviedb.org/3/movie/top_rated?api_key=b199eab06bc931ed71cd20c95e4b2bb3
// https://api.themoviedb.org/3/movie/550?api_key=b199eab06bc931ed71cd20c95e4b2bb3

    fun goTOnextScreen() {
        val resultIntent = Intent(this, ActivityMovieRetrieveCache::class.java)
startActivity(resultIntent)

    }

    fun serviceCall() {
        val networkService = NetworkService.getService()
        val callx = networkService.getMoviesCd()


        callx.enqueue(object : Callback<MovieList> {
            override fun onResponse(call: Call<MovieList>, response: Response<MovieList>) {
                Log.d("aaa", "Number of movies received: ")
                val statusCode = response.code()
                //   val moviesx: List<Movies> = response.body()
                val moviesx = response.body()?.movies
                //var n = moviesx?.get(0)
                var n = moviesx

                val coroutineScope =
                    CoroutineScope(Dispatchers.Main)

                coroutineScope.launch(Dispatchers.Main) {
                    var movieDataBase: MovieDataBase? = null
                    var movieDao: MovieOrigDao? = null
                    movieDataBase = MovieDataBase.getDatabase(this@MainActivity)
                    movieDao = movieDataBase.movieAbs()
                    // pojoa = new pojo()
                    movieDao.insert(n)
                }


                //        recyclerView.adapter = MovieAdapter(
                //          moviesx, this@MainActivity
                //      )


            }

            override fun onFailure(call: Call<MovieList>, t: Throwable) {
                Log.d("aaa", "Number of movies received: ")
            }

        })


    }

    fun jj(){
        val k = KotlinAct("s")
    }

    fun otherReturnType(){
        val networkService = NetworkService.getService()
        val singleX = networkService.getMoviesList()
        // list dont do obsere
    //    singleX.

/*
        networkService.getMovies(photoId, object : Callback<MovieList?> {
            fun onSuccess(photo: MovieList?, response: Response<*>?) {}
        })

 */

    }

}