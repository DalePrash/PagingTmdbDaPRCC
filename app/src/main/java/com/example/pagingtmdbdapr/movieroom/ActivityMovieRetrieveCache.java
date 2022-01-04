package com.example.pagingtmdbdapr.movieroom;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import com.example.pagingtmdbdapr.R;
//import com.example.pagingtmdbdapr.wast.MoviViewModel;

public class ActivityMovieRetrieveCache extends AppCompatActivity {
    private MovieDataBase movieDataBase;
   // private MovieDao movieDao;
    private MovieOrigDao movieDao;

    //MoviViewModel moviViewModel;

private TextView textLanguage, textTitle, textAdult, textId;
private Button buttonx;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
   //     moviViewModel = ViewModelProviders.of(this).get(MoviViewModel.class);
     init();
    }


    void init()
    {
textAdult = findViewById(R.id.textmovieAdult);
        textId = findViewById(R.id.textmovieId);


        textLanguage = findViewById(R.id.textmovieLanguage);
        buttonx = findViewById(R.id.buttonGetMovie);
        buttonx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movieDataBase = MovieDataBase.getDatabase( ActivityMovieRetrieveCache.this);
                movieDao = movieDataBase.movieAbs();
               // movieDao.getAlphabetizedWords();
                Log.i("a","a");
            }
        });





    }
}
