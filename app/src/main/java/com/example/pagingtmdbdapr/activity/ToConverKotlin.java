package com.example.pagingtmdbdapr.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pagingtmdbdapr.R;
import com.example.pagingtmdbdapr.customview.CustomView;
import com.example.pagingtmdbdapr.customview.ImageViewText;
import com.example.pagingtmdbdapr.kottln.APICl;
import com.example.pagingtmdbdapr.kottln.NetServe;
import com.example.pagingtmdbdapr.kottln.Pojo;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ToConverKotlin extends AppCompatActivity {
    private ImageViewText imageViewText;
   private  static Button button;
    private  static TextView textX;
            static {
    int k = 11;
    String s ="gggg";
                }
    static  ImageViewText imageViewTextstatic;
    public ToConverKotlin() {

    }
   protected ToConverKotlin(String data) {

    }
 private ToConverKotlin(String data, int ku, ImageViewText k)
    {
this(data);
this.imageViewText = k;
super.bindService(null,null,0);

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kotlin);
    }

    void nonStatic() {

    }

      void StaticMeth() {
        imageViewTextstatic = new ImageViewText(null,null);
        button = findViewById(R.id.buttonGetMovie);
        textX = findViewById(R.id.textView3);

        textX.setOnClickListener(view -> {
            Intent intent = new Intent(ToConverKotlin.this, CustomView.class);
            startActivity(intent);
        });
    }
    static  void objectofInterface() {
        NetServe apiService =
                APICl.getClient().create(NetServe.class);

        Call<Pojo> call = apiService.getTopRatedMovies();
        call.enqueue(new Callback<Pojo>() {
            @Override
            public void onResponse(Call<Pojo> call, Response<Pojo> response) {
                Log.i("a","a");
                Thread thread = new Thread(){
                    public void run(){
                        Log.i("a","a");
                    }
                };

                thread.start();

            }

            @Override
            public void onFailure(Call<Pojo> call, Throwable t) {
                Log.i("a","a");

            }
        });

    }







}
