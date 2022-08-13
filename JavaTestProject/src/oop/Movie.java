package oop;

public class Movie {
    private final String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getNote() {
        return "No!";
    }
}
