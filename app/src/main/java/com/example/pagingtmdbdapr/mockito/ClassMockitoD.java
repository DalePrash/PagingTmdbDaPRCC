package com.example.pagingtmdbdapr.mockito;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class ClassMockitoD extends Service {

public Context context;
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


public String methodDD()
{
    return "aa";
}
    public String methodDedependent(ClassMockitoC c)
    {
        //String n = c.methodcc();
      c.methodcc();
      return "aaaa";
    }


    public String methodDedependent(ClassMockitoC c, Intent intent, Context context)
    {
        this.context = context;
        //String n = c.methodcc();
        c.methodcc();
        intent.setAction("aaa");
        startActivity(intent);

        return "aaaa";
    }


    private ClassMockitoD database;


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onLowMemory() {
      //  super.onLowMemory();
      //  int k = 11;
       // int j = 22;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        String n = getUniqueId();
        ClassMockitoB b = new ClassMockitoB();
       // b.query("ddd");
        return super.onStartCommand(intent, flags, startId);
    }
}
