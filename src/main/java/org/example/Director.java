package org.example;

public class Director extends Person {

    private int numberOfMovies;

    public Director(String id, String name, int numberOfMovies) {
        super(id, name);
        this.numberOfMovies = numberOfMovies;
    }

    public String toString() {
        return super.toString() + ", number of movies = "
                + numberOfMovies;
    }

    public int getNumberOfMovies() {
        return numberOfMovies;
    }
}
