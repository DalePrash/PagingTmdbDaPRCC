package com.example.pagingtmdbdapr.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
//import androidx.fragment.app.Fragment;

import com.example.pagingtmdbdapr.R;
import android.app.Fragment;
import android.widget.Button;
import android.widget.TextView;

public class FragmentA extends Fragment { //implements FragmentB.OnItemSelectedListener  {

    TextView textView;
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_aaa,
                container, false);
textView= (TextView) view.findViewById(R.id.text_frag_a);
        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);



    }


    @Override
    public void onDetach() {
        super.onDetach();
    }




 /*   @Override
    public void onRssItemSelected(String link) {
        //Fragment fragmentB = new FragmentB();


        textView.setText("link");
      /*  FragmentB fragment = (FragmentB) getFragmentManager()
                .findFragmentById(R.id.detailFragment);
        fragment.setText(text);

       */
    //}



    public  void updateDetail(String uri) {
        textView.setText(uri);

    }


}
