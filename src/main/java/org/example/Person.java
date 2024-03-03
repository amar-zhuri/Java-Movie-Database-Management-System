package org.example;

public class Person {

    protected String id, name;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + ", " + name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
