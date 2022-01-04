package com.example.pagingtmdbdapr.adapter;

import android.content.Context;
import android.graphics.Movie;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pagingtmdbdapr.R;
import com.example.pagingtmdbdapr.pojo.Movies;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieHolder> {
    private List<Movies> movies;
    private Context context;

    public MovieAdapter(List<Movies> movies, Context context) {
        this.movies = movies;
        this.context = context;
    }

    @NonNull
    @Override
    public MovieHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       // View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_page, parent, false);
        //return new MovieHolder(view);

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_card_view, parent, false);
        return new MovieHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MovieHolder holder, int position) {
        holder.movieTitle.setText(movies.get(position).getMovieTitle());
        holder.movieLanguage.setText(movies.get(position).getMovieLanguage());

    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public static class MovieHolder extends RecyclerView.ViewHolder {
        TextView movieTitle;
        TextView movieLanguage;
        public MovieHolder(@NonNull View itemView) {
            super(itemView);
        //    movieTitle = itemView.findViewById(R.id.movieTitle);
         //   movieLanguage = itemView.findViewById(R.id.movieLanguage);



            movieTitle = itemView.findViewById(R.id.idCardTitle);
               movieLanguage = itemView.findViewById(R.id.idCardLanguage);

        }
    }
}
