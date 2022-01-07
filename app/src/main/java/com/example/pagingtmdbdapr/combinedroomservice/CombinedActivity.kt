package com.example.pagingtmdbdapr.combinedroomservice

//import com.example.pagingtmdbdapr.movieroom.MovieDataBase
//import com.example.pagingtmdbdapr.movieroom.MovieOrigDao
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
import com.example.pagingtmdbdapr.service.NetworkService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

public class CombinedActivity  : AppCompatActivity() {

    private val recyclerView: RecyclerView by lazy {
        findViewById(R.id.recy) as RecyclerView
    }
    private val butonxx: Button by lazy {
        findViewById(R.id.buttonXX) as Button
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_combined)
        recyclerView.setLayoutManager(object : LinearLayoutManager(this@CombinedActivity) {

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
     //  resultIntent.flags=Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FL
    //    resultIntent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(resultIntent)

    }

    fun serviceCall() {
        val networkService = NetworkService.getService()
        val callx = networkService.getMoviesC()
        callx.enqueue(object : Callback<Pojo> {
            override fun onResponse(call: Call<Pojo>, response: Response<Pojo>) {
                Log.d("aaa", "Number of movies received: ")
         //       val statusCode = response.code()
                val body = response.body()
                //   val moviesx: List<Movies> = response.body()
                //   val moviesx = response.body()?.movies
                //var n = moviesx?.get(0)
                //     var n = moviesx


                val thread: Thread = object : Thread() {
                    override fun run() {
                        val md = MovieDataBase.getDatabase(this@CombinedActivity)
                        val mdao = md.movieAbs()
                        mdao.insert(response.body())
                        Log.i("a", "a")
                    }
                }

                thread.start()


            /*    val coroutineScope =
                    CoroutineScope(Dispatchers.Main)

                coroutineScope.launch(Dispatchers.Main) {
                    var movieDataBase: MovieDataBase? = null
                    var movieDao: MovieOrigDao? = null
                    movieDataBase = MovieDataBase.getDatabase(this@CombinedActivity)
                    movieDao = movieDataBase.movieAbs()
                    // pojoa = new pojo()
                    movieDao.insert(body)
                }

             */


                /*    coroutineScope.launch(Dispatchers.Main) {
                    recyclerView.adapter = MovieAdapter(
                          moviesx, this@CombinedActivity
                             )
                          }


            */


                //        recyclerView.adapter = MovieAdapter(
                //          moviesx, this@CombinedActivity
                //      )


            }

            override fun onFailure(call: Call<Pojo>, t: Throwable) {
                Log.d("aaa", "Number of movies received: ")
            }

        })


    }

    fun jj() {
        val k = KotlinAct("s")
    }

}