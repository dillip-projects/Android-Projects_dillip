package com.example.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

     RecyclerView recyclerView;
    List<Movie> movieList=new ArrayList<>();
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerview);
        myAdapter=new MyAdapter(movieList);

        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        //binding recycler view to adapter
        recyclerView.setAdapter(myAdapter);

        insertData();
    }

    private void insertData() {

        Movie movie=new Movie("Fast & furious","Action","2019");
        movieList.add(movie);
         movie=new Movie("Spiderman","Action","2019");
        movieList.add(movie);

        myAdapter.notifyDataSetChanged();
    }
}

//working great in git hub