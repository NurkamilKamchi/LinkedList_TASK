package models;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Movie {
    private String name;
    private int year;
    private Genre genre;
    private Producer producer;
    public List<Actor> actors = new ArrayList<>();

    public Movie() {
    }

    public Movie(String name, int year, Genre genre, Producer producer, ArrayList<Actor> actors) {
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.producer = producer;
        this.actors = actors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public ArrayList<Actor> getActors() {
        return (ArrayList<Actor>) actors;
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "Movie " +
                " \n NAME: " + name +
                " \n YEAR: " + year +
                " \n GENRE: " + genre +
                " \n PRODUCER: " + producer +
                "  ACTORS: " + actors +"\n";
    }
}
