package com.example.pagingtmdbdapr.kottln;

import android.util.Log;

import androidx.paging.PagingSource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import kotlin.coroutines.Continuation;

class ConstructorKotlin extends PagingSource<Integer, NewsPojo>{

    ConstructorKotlin(){

    }
    ConstructorKotlin(String str){

    }

    @Nullable
    @Override
    public Object load(@NotNull LoadParams<Integer> loadParams, @NotNull Continuation<? super LoadResult<Integer, NewsPojo>> continuation) {

       ConstructorKotlin xx = new ConstructorKotlin();
       xx.set();
        return null;
    }

    void set()
    {
        Log.v("a","a");
    }
}
