package com.example.pagingtmdbdapr.sharedpref;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pagingtmdbdapr.R;

public class SharedPreferenceMainActivity extends AppCompatActivity {
    private  static Context mContext;

    static EditText ed1,ed2;
  static   Button b1, b2;
  static   TextView t1,t2,t3;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_pref);

        ed1=(EditText)findViewById(R.id.editSharedA);
        ed2=(EditText)findViewById(R.id.editSharedB);
        b1=findViewById(R.id.buttonSharedA);
        b2=findViewById(R.id.buttonSharedB);
        t1 =findViewById(R.id.textSharedA);
        t2 =findViewById(R.id.textSharedB);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed1!=null && ed2!=null) {
                    saveSharepref(SharedPreferenceMainActivity.this);
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed1!=null && ed2!=null) {
                    retreiveSharepref(SharedPreferenceMainActivity.this);
                }
            }
        });



    }

    static void saveSharepref(Context c)
    {mContext = c;
        SharedPreferences pref = c.getSharedPreferences("myPrefsKey",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("ed1",ed1.getText().toString());
        editor.putString("ed2",ed2.getText().toString());
        editor.commit();

    }
    static void retreiveSharepref(Context c)
    {   mContext = c;
        SharedPreferences pref = c.getSharedPreferences("myPrefsKey",Context.MODE_PRIVATE);
        String text1 =pref.getString("ed1",null)  ;
        String text2 =pref.getString("ed2",null)  ;

        t1.setText(text1);
        t2.setText(text2);

        //editor.commit();

    }
    static void shareprefFirst()
    {
     /*   SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editora=sharedPreferences.edit();
        SharedPreferences.Editor editorb=sharedPreferences.edit();
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putBoolean("keyname",true);
        editor.putString("keyname","string value");
        editor.putInt("keyname",9);
        editor.putFloat("keyname",22);
        editor.putLong("keyname",2);
        editor.commit();
        */

    }

    static void shareprefFirst(Context c)
    {
        mContext = c;
        SharedPreferences pref = c.getSharedPreferences("myPrefsKey",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.remove("keyname");
        editor.commit();
    }

    static void shreThird(Context c)
    {
        mContext = c;
/*
        SharedPreferences.Editor editor = mContext.sharedpreferences.edit();
        editor.putString("key", "value");
        editor.commit();

 */
    }
}
