package com.example.pagingtmdbdapr.movieroom;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.pagingtmdbdapr.pojo.MovieList;
import com.example.pagingtmdbdapr.pojo.Movies;

import java.util.List;
@Dao
public interface MovieOrigDao {
  //  @Query("SELECT * FROM movieparts_table ORDER BY id ASC")
  @Query("SELECT * FROM movieparts_table")
  void getAlphabetizedWords(MovieList h);

    // @Insert(onConflict = OnConflictStrategy.IGNORE)
  //  @Insert
  //  void insert(MovieList nTitle);

    @Insert
    void insert(List<Movies> nTitle);


    @Delete
    void delete(MovieList nTitle);

    @Query("DELETE FROM movieparts_table")
    void deleteAll();

    // @RawQuery("SELECT * FROM news_table")

    @Query("SELECT * FROM movieparts_table")
    List<Movies> getGenders();


}
