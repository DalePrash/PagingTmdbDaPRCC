package com.example.pagingtmdbdapr.mockito;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;
import androidx.room.Database;

public class ClassMockitoA extends Service {


private String uniqueId;

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public boolean isAvailable() {
        // currently not implemented, as this is just demo used in a software test
        return false;
    }
    public String getUniqueId() {
        return "cake";
    }




    private ClassMockitoA database;


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        String n = getUniqueId();
        ClassMockitoB b = new ClassMockitoB();
       // b.query("ddd");
        return super.onStartCommand(intent, flags, startId);
    }


    void sample(Context context, Context context1, Context context2, Context context3)
    {
        context = getApplicationContext();
        context = getBaseContext();
       // context = getContext();

        context = getApplicationContext();

    }


}
