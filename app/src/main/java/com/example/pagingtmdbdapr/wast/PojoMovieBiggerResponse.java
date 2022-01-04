package com.example.pagingtmdbdapr.wast;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.PrimaryKey;

import java.util.List;

//@Entity(tableName = "movie_table")
public class PojoMovieBiggerResponse {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "results")
    private List<PojoBMovieParts> response;
// u can name anything above as movieTitle etc.


}
