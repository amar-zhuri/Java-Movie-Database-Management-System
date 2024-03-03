package org.example;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        Actor a1 = new Actor("111", "Actor1");
        Actor a2 = new Actor("112", "Actor2");
        Actor a3 = new Actor("113", "Actor3");

        ArrayList<Actor> actors = new ArrayList<>();
        actors.add(a1);
        actors.add(a2);
        actors.add(a3);

        Screenwriter s1 = new Screenwriter("121", "Screenwriter1", 6);
        Screenwriter s2 = new Screenwriter("122", "Screenwriter2", 3);

        ArrayList<Screenwriter> screenwriters = new ArrayList<>();
        screenwriters.add(s1);
        screenwriters.add(s2);

        Director r1 = new Director("101", "Director1", 8);

        Movie f1 = new Movie("Movie1", r1, screenwriters, actors);

        a1.addMovie(f1);
        a2.addMovie(f1);
        a3.addMovie(f1);

        System.out.println(r1);
        System.out.println(s1);
        System.out.println(a1);
        System.out.println(f1);

        a1.printMovies();
    }
}
