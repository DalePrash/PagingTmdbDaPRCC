package com.example.pagingtmdbdapr.data
import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource
import com.example.pagingtmdbdapr.pojo.Movies
import com.example.pagingtmdbdapr.service.NetworkService
import io.reactivex.disposables.CompositeDisposable
class MoviesDataSourceFactory  (
    private val compositeDisposable: CompositeDisposable,
    private val networkService: NetworkService
) : DataSource.Factory<Int, Movies>() {
    override fun create(): DataSource<Int, Movies> {
        val  moviesDataSourceLiveData = MutableLiveData<MovieDataSource>()

        val moviesDataSource = MovieDataSource(networkService, compositeDisposable)
        moviesDataSourceLiveData.postValue(moviesDataSource)
        return moviesDataSource    }


}