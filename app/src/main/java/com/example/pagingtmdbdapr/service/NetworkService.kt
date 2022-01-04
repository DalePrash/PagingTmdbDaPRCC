package com.example.pagingtmdbdapr.service
import com.example.pagingtmdbdapr.combinedroomservice.Pojo
import com.example.pagingtmdbdapr.pojo.MovieList
import io.reactivex.Single
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
interface NetworkService {
@GET("top_rated?api_key=b199eab06bc931ed71cd20c95e4b2bb3")
    fun getMoviesB( ): Single<com.example.pagingtmdbdapr.pojo.MovieList>
//fun getMovies1(@Query("page") page: Int, @Query("pageSize") pageSize: Int): Single<com.example.pagingtmdbdapr.pojo.MovieList>

    @GET("top_rated?api_key=b199eab06bc931ed71cd20c95e4b2bb3")
    fun getMoviesCd( ): Call<MovieList>


    @GET("top_rated?api_key=b199eab06bc931ed71cd20c95e4b2bb3")
    fun getMoviesC( ): Call<Pojo>


    @GET("top_rated?api_key=b199eab06bc931ed71cd20c95e4b2bb3")
    fun getMovies( ): Single<MovieList>

    @GET("top_rated?api_key=b199eab06bc931ed71cd20c95e4b2bb3")
    fun getMoviesList( ): List<MovieList>

    /*
    it can be paging, List, Call, Observable etc.
    point is what to do Enqueue, observe etc.
    lets check company code
     */

companion object {
    public fun getService(): NetworkService {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/3/movie/")
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(NetworkService::class.java)
    }
}

}