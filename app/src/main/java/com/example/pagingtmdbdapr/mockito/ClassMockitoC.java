package com.example.pagingtmdbdapr.mockito;

import android.content.Intent;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ClassMockitoC  extends RecyclerView.Adapter {



    ClassMockitoC()
    {

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
//        holder.movieTitle.setText(movies.get(position).getMovieTitle());
  //      holder.movieLanguage.setText(movies.get(position).getMovieLanguage());

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    private ClassMockitoA database;

    public ClassMockitoC(ClassMockitoA database) {
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
        return String.valueOf(database.getUniqueId());
    }


    public String methodcc()
    {
        return "c";
    }

}
