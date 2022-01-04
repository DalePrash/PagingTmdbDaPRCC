package com.example.pagingtmdbdapr.activity;

import android.content.Context;

class Coreframework {
  static   Context context;
    static Coreframework pagingSource;
    Coreframework()
    {

    }
    public static Coreframework getInstance(Context mC) {
        if (context == null) {
context = mC;
        }

        if (pagingSource == null){
            pagingSource = new Coreframework();
        }
        return  pagingSource;
    }
}



