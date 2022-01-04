package com.example.pagingtmdbdapr.fragments;

import android.app.FragmentTransaction;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Fragment;
import android.util.Log;

import androidx.fragment.app.FragmentManager;

import com.example.pagingtmdbdapr.R;

public class MainFragment extends AppCompatActivity   implements FragmentB.OnItemSelectedListener {
    //Fragment fragmentA;
   // Fragment fragmentB;
    FragmentA fragmentA;
    FragmentB fragmentB;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_main);

     // Fragment fragment = new ListFragmentClickable();
         fragmentA = new FragmentA();
         fragmentB = new FragmentB();

        FragmentManager fm = getSupportFragmentManager();
       // FragmentTransaction ft = fm.beginTransaction();
        FragmentTransaction ft = getFragmentManager().beginTransaction();

        ft.replace(R.id.frame_a, fragmentA);
        ft.replace(R.id.frame_b, fragmentB);

        ft.commit();

       /*
       FragmentTransaction ft = getFragmentManager().beginTransaction();
        FragmentA listFragment = new FragmentA();
        ft.add(R.id.displayList, listFragment, "List_Fragment");
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();

        */


    }

    @Override
    public void onRssItemSelected(String link) {
        Log.i("a","b");
        fragmentA.updateDetail(link);

    }
}
