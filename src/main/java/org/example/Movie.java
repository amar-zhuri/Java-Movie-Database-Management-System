package org.example;

import java.util.ArrayList;

public class Movie {

    private String title;
    private Director director;
    private ArrayList<Screenwriter> screenwriters;
    private ArrayList<Actor> actors;

    public Movie(String title, Director director,
                 ArrayList<Screenwriter> screenwriters, ArrayList<Actor> actors) {
        this.title = title;
        this.director = director;
        this.screenwriters = screenwriters;
        this.actors = actors;
    }

    public String toString() {
        return "Title: " + title + ", Director: " + director
                + "Screenwriters: " + screenwriters
                + "Actors: " + actors;
    }

    public String getTitle() {
        return title;
    }

    public Director getDirector() {
        return director;
    }

    public ArrayList<Screenwriter> getScreenwriters() {
        return screenwriters;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }
}
