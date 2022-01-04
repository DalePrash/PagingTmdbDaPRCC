package com.example.pagingtmdbdapr.wast;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

//@Entity(tableName = "movieparts_table")
public class PojoBMovieParts {


    @SerializedName("original_title")
    private String title;

    @SerializedName("original_language")
    private String language;

    @SerializedName("adult")
    private boolean adult;

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "movieId")
    @SerializedName("id")
    private long id;
    // has to find out how to go inside GenreIds

}
