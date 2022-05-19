package com.example.recyclerviewapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<Movie> movieList;


    public MyAdapter(List<Movie> movieList) {
        this.movieList = movieList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {

        View itemView= LayoutInflater.from(parent.getContext()).
                inflate(R.layout.movie_row,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull  MyAdapter.MyViewHolder holder, int position) {
   Movie movie=movieList.get(position);
   holder.title.setText(movie.getTitle());
   holder.genre.setText(movie.getGenre());
   holder.date.setText(movie.getDate());
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    //create a new class called : MyViewHolder

    public class MyViewHolder extends RecyclerView.ViewHolder{

        //create widgets

        public TextView title,genre,date;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            title=itemView.findViewById(R.id.texttitle);
            genre=itemView.findViewById(R.id.textgenre);
            date=itemView.findViewById(R.id.textdate);
        }
    }


}
