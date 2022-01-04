package com.example.pagingtmdbdapr.combinedroomservice;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.pagingtmdbdapr.pojo.Movies;

import java.util.List;

@Dao
public interface MovieOrigDao {
    @Query("SELECT * FROM mov_table")
    List<Pojo> getAlphabetizedWords();

    // @Insert(onConflict = OnConflictStrategy.IGNORE)
    //  @Insert
    //  void insert(MovieList nTitle);
// it will replace previous data when entering

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Pojo nTitle);


 //   @Insert(onConflict = OnConflictStrategy.REPLACE)
  //  void insert(List<Movies> nTitle);

    @Delete
    void delete(Pojo nTitle);

    @Query("DELETE FROM mov_table")
    void deleteAll();

    // @RawQuery("SELECT * FROM news_table")




}
