package com.example.pagingtmdbdapr.viewmodel;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;

import com.example.pagingtmdbdapr.R;
import com.example.pagingtmdbdapr.databinding.ActivityViewModelBinding;

import static com.example.pagingtmdbdapr.viewmodel.CustomViewViewModel.kk;

public class ViewModelMain  extends AppCompatActivity implements ViewModelContractor, LifecycleOwner {

//  public   User user= new User("Aakash","Hindi");
  ActivityViewModelBinding binding;
    CustomViewViewModel customViewViewModel;

    TextView te;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     //   setContentView(R.layout.activity_view_model);
            binding = DataBindingUtil.setContentView(this, R.layout.activity_view_model);
        customViewViewModel = ViewModelProviders.of(this).get(CustomViewViewModel.class);
te = findViewById(R.id.textXyz);
        cake();
        User user= new User("Aakash","THIIISS");
//binding.setUser
  //    binding.setItemx(user);
   //     binding.setT(user);
        binding.setItemY(user);


       /*  customViewViewModel.user.setName("Akkau");
        customViewViewModel.user.setLanguage("Yuefd");
   binding.textX.setText(kk());

        */
        //  binding.user.
    }

    @Override
    public void setT(User user) {


    }

    public String name (){
        return "aa";
    }


    /*


    To implement two-way data binding you need to change the following: android:text="@{user.password}" to android:text="@={user.password}"

     */
    void cake() {
        // observe only if the axis method has return type as LiveData
        // shall we use value
       te.setText( customViewViewModel.axis());
    }
}
