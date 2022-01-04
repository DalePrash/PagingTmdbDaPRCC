package com.example.pagingtmdbdapr.util;

import android.util.Log;

public  final class Logger {
    private static final Logger instance = new Logger();

    //Retrieve the execution directory. Note that this is whereever this process was launched
    public String logname = "simplelog";
    protected String env = System.getProperty("user.dir");

    public static Logger getInstance(){
        return instance;
    }

    public static Logger getInstance(String withName){
        instance.logname = withName;
        return instance;
    }
    private Logger()
    {

    }
    public static void i(String tag, String message)
    {
logg(tag,message,"i",null);
    }
    public static void d(String tag, String message)
    {
        logg(tag,message,"d",null);
    }
    public static void e(String tag, String message,Throwable throwable)
    {
        logg(tag,message,"d",throwable);
    }

    static void logg(String tag, String message,String type,Throwable throwable)
    {
        switch (type){
            case "i":
                Log.i(tag,message,throwable);
                break;
            case "d":
                Log.d(tag,message,throwable);
                break;
                case "v":
                Log.v(tag,message,throwable);
                break;

            case "w":
                Log.w(tag,message,throwable);
                break;
            case "e":
                Log.e(tag,message,throwable);
                break;
        }
    }


}
