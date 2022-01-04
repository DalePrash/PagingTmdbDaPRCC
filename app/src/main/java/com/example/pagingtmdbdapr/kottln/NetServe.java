package com.example.pagingtmdbdapr.kottln;
import retrofit2.Call;
import retrofit2.http.GET;

public interface NetServe {

    @GET("550?api_key=b199eab06bc931ed71cd20c95e4b2bb3")
    Call<Pojo> getTopRatedMovies();



}
