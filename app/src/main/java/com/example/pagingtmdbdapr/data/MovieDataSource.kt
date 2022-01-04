package com.example.pagingtmdbdapr.data

import androidx.paging.PageKeyedDataSource
import com.example.pagingtmdbdapr.pojo.Movies
import com.example.pagingtmdbdapr.service.NetworkService
import androidx.lifecycle.MutableLiveData
import io.reactivex.Completable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Action
import io.reactivex.schedulers.Schedulers
class MovieDataSource (
    private val networkService: NetworkService,
    private val compositeDisposable: CompositeDisposable
) : PageKeyedDataSource<Int, Movies>() {
    var state: MutableLiveData<State> = MutableLiveData()

    override fun loadInitial(
        params: LoadInitialParams<Int>,
        callback: LoadInitialCallback<Int, Movies>
    ) {

        compositeDisposable.add(networkService.getMovies().subscribe(
            { response ->callback.onResult(
            response.movies,
            null,
            2)
        }   )
        )
        TODO("Not yet implemented")
    }

    override fun loadBefore(params: LoadParams<Int>, callback: LoadCallback<Int, Movies>) {
        TODO("Not yet implemented")
    }

    override fun loadAfter(params: LoadParams<Int>, callback: LoadCallback<Int, Movies>) {
        TODO("Not yet implemented")
    }
    private fun updateState(state: State) {
        this.state.postValue(state)
    }
}