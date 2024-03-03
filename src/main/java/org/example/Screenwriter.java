package org.example;

public class Screenwriter extends Person {

    private int numberOfMovies;

    public Screenwriter(String id, String name, int numberOfMovies) {
        super(id, name);
        this.numberOfMovies = numberOfMovies;
    }

    @Override
    public String toString() {
        return super.toString() + ", number of movies = " + numberOfMovies;
    }

    public int getNumberOfMovies() {
        return numberOfMovies;
    }
}
