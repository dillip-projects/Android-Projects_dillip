package com.example.recyclerviewapp;

public class Movie {
    //This is a modal class
    //1-creating 3 strings
    private String title,genre,date;

    //2-creating constructors

    public Movie(String title, String genre, String date) {
        this.title = title;
        this.genre = genre;
        this.date = date;
    }

    //to avoid bugs create empty constructor

    public Movie() {
    }

    //-getting and setting data(Getters and Setter)

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
