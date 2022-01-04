package com.example.pagingtmdbdapr.workmanager;
import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.work.Data;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

import io.reactivex.Scheduler;

public class SampleWorker extends Worker {
    // invalidate cache if not working correcly
    public SampleWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    // all time consuming here in the doWork method
    @NonNull
    @Override
    public Result doWork() {
        Data inputData = getInputData();
        int number = inputData.getInt("number",-1);
        String name = inputData.getString("name");
        String namde = inputData.getString("xx");


        Log.d("aaaa","dowork: "+ number);

        for (int i = number; i>0; i--){
            Log.d("aaaa","dowWOrk" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return Result.failure();
            }
           // return Result.retry();
        }

        // small success
        return Result.success();
    }
}
