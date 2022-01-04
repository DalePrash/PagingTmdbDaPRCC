package com.example.pagingtmdbdapr.service.bind;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

import androidx.annotation.Nullable;

import com.example.pagingtmdbdapr.R;

import java.util.Random;
public class BindService  extends Service {

    private int mRandomNumber;
    private boolean mIsRandomGeneratorOn;

    private final int MIN=0;
    private final int MAX=100;

    public static final int GET_COUNT=0;

    private class RandomNumberRequestHandler extends Handler{
        @Override
        public void handleMessage(Message msg) {
            Log.i("SERVICE","Message intercepted");
            switch (msg.what){
                case GET_COUNT: Message  messageSendRandomNumber=Message.obtain(null,GET_COUNT);
                    messageSendRandomNumber.arg1=getRandomNumber();
                    try{
                        Log.i("SERVICE","Replaying with random number to requester");
                        msg.replyTo.send(messageSendRandomNumber);
                    }catch (RemoteException e){
                        Log.i("SERVICE",""+e.getMessage());
                    }
            }
            super.handleMessage(msg);
        }
    }

    class MyServiceBinder extends Binder{
        public BindService getService(){
            return BindService.this;
        }
    }

    private IBinder mBinder=new MyServiceBinder();

    private Messenger randomNumberMessenger=new Messenger(new RandomNumberRequestHandler());

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.i("SERVICE","In OnBind");
        if(intent.getPackage()=="com.example.pagingtmdbdapr.service.bind"){
            return randomNumberMessenger.getBinder();
        }else{
            return mBinder;
        }
    }

    @Override
    public void onRebind(Intent intent) {
        super.onRebind(intent);
        Log.i("SERVICE","In OnReBind");
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        Log.i("SERVICE","Service Started");
    }



    @Override
    public void onDestroy() {
        super.onDestroy();
        stopRandomNumberGenerator();
        Log.i("SERVICE","Service Destroyed");
    }



    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i("SERVICE","In onStartCommend, thread id: "+Thread.currentThread().getId());
        mIsRandomGeneratorOn =true;
        new Thread(new Runnable() {
            @Override
            public void run() {
                startRandomNumberGenerator();
            }
        }).start();
        return START_STICKY;
    }

    private void startRandomNumberGenerator(){
        while (mIsRandomGeneratorOn){
            try{
                Thread.sleep(1000);
                if(mIsRandomGeneratorOn){
                    mRandomNumber =new Random().nextInt(MAX)+MIN;
                    Log.i("SERVICE","Thread id: "+Thread.currentThread().getId()+", Random Number: "+ mRandomNumber);
                }
            }catch (InterruptedException e){
                Log.i("SERVICE","Thread Interrupted");
            }

        }
    }

    private void stopRandomNumberGenerator(){
        mIsRandomGeneratorOn =false;
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.i("SERVICE","In onUnbind");
        return super.onUnbind(intent);
    }

    public int getRandomNumber(){
        return mRandomNumber;
    }
}