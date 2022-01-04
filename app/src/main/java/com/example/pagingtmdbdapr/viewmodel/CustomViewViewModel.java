package com.example.pagingtmdbdapr.viewmodel;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import androidx.lifecycle.ViewModel;

import com.example.pagingtmdbdapr.viewmodel.User;

public class CustomViewViewModel extends ViewModel {
// dashboard_all_accounts
static Context context;
public static String kk() {

return "KKKKK";


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

    public String axis()
    {
        return "axis";
    }


}
