package org.example;

import java.util.ArrayList;

public class Actor extends Person {

    private ArrayList<Movie> movies;

    public Actor(String id, String name) {
        super(id, name);
        movies = new ArrayList<>();
    }

    public void addMovie(Movie m) {
        movies.add(m);
    }

    public String toString() {
        return super.toString();
    }

    public void printMovies() {
        for(Movie m : movies)
            System.out.println(m);
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }
}
