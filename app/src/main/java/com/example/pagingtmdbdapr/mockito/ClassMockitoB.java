package com.example.pagingtmdbdapr.mockito;

import android.content.Context;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Database;

public class ClassMockitoB extends AppCompatActivity {

    ClassMockitoB()
    {

    }

    ClassMockitoB(Context context)
    {

    }


    private ClassMockitoA database;

    public ClassMockitoB(ClassMockitoA database) {
        this.database = database;
    }

    public boolean query(String query) {
        ClassMockitoA a = new ClassMockitoA();
        Intent intent = new Intent();
     //   a.onStartCommand(intent,0,0);
        return database.isAvailable();
    }


    @Override
    public String toString() {
        return   String.valueOf(database.getUniqueId());
    }



    static final public class Dummy {
        public int testing() {
            return var1.length();
        }

        static String var1 = null;

        static public String foo() {
            return "foo";
        }

        static  public String foo(String var2) {
            var1 = var2;
            return "SUCCESS";
        }
    }
}
