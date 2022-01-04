package com.example.pagingtmdbdapr.customview;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import androidx.lifecycle.ViewModel;

import com.example.pagingtmdbdapr.viewmodel.User;

public class CustomViewViewModel extends ViewModel {
// dashboard_all_accounts
static Context context;
void kk() {


   // DataBindingUtil.setContentView(this, R.layout.activity_main);


}
    User user= new User("Aakash","Hindi");


    public static void handleClick(View v)
    {
    //     v.getContext().intentX();
    }

    private static void intentX()
    {
        Intent i = new Intent();
        i.setAction("x");
        context.startActivity(i);

    }


}
