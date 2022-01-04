package com.example.pagingtmdbdapr.movieroom;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.example.pagingtmdbdapr.pojo.MovieList;
import com.example.pagingtmdbdapr.pojo.Movies;

@Database(entities = {Movies.class}, version = 1, exportSchema = false)
public  abstract class MovieDataBase extends RoomDatabase {
    private static volatile MovieDataBase INSTANCE;

   // abstract MovieDao movieAbs();
  public   abstract MovieOrigDao movieAbs();

    @Override
    public void close() {
        super.close();
    }

    public static MovieDataBase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (MovieDataBase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            MovieDataBase.class, "movie_database")
                         .addCallback(sRoomDatabaseCallback)
                        .allowMainThreadQueries()
                            .build();
                }
            }
        }
        return INSTANCE;
    }



    private static RoomDatabase.Callback sRoomDatabaseCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
        }
    };
  public   void destroyDataBase(){
        INSTANCE = null;
    }

}
