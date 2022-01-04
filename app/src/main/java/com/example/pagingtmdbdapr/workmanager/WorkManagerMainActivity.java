package com.example.pagingtmdbdapr.workmanager;

import android.net.Network;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;

import com.example.pagingtmdbdapr.R;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class WorkManagerMainActivity  extends AppCompatActivity {

    // kind of all operations like JobScheduler


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_manager);

        Data data= new Data.Builder()
                .putInt("number",10)
                .putString("xx","yy")
                .build();

        Constraints constraints = new Constraints.Builder()
                .setRequiredNetworkType(NetworkType.CONNECTED)
                .setRequiresCharging(true)
                .build();

        OneTimeWorkRequest downloadRequest = new OneTimeWorkRequest.Builder(SampleWorker.class)
                .setInputData(data)
                .setConstraints(constraints)
                .setInitialDelay(5, TimeUnit.SECONDS)
                .addTag("download")
                .build();

        WorkManager.getInstance(this).enqueue(downloadRequest);

    }
}
