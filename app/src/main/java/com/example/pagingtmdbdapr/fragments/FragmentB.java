package com.example.pagingtmdbdapr.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
//import androidx.fragment.app.Fragment;
import android.app.Fragment;

import com.example.pagingtmdbdapr.R;

public class FragmentB extends Fragment  {


    private OnItemSelectedListener listener;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_bbb,
                container, false);
       Button button = (Button) view.findViewById(R.id.button_frag_b);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           //   listener.updateDetail("testing");
                if (listener!= null)
                listener.onRssItemSelected("testing");
            }
        });


        return view;
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        if (context instanceof OnItemSelectedListener) {
            listener = (OnItemSelectedListener) context;
        } else {
         //   throw new ClassCastException(context.toString()
         //           + " must implemenet MyListFragment.OnItemSelectedListener");
        }


    }


    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }


    public interface OnItemSelectedListener {
        public void onRssItemSelected(String link);
    }


  //  public  void updateDetail(String uri) {
        // create a string just for testing
        String newTime = String.valueOf(System.currentTimeMillis());

        // inform the Activity about the change based
        // interface defintion


      //  listener.onRssItemSelected(uri);
  //  }


    /*
    Bundle bundle = new Bundle();
bundle.putString("link", link);
detailFragment.setArguments(bundle);
     */
}

