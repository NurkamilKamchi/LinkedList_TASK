package service.impl;

import models.Genre;
import models.Movie;

import java.util.ArrayList;

public interface MovieService {
    public   ArrayList<Movie> getAllMovies();
    ArrayList<Movie> findByMovieName(String name);
    ArrayList<Movie> findByMovieActorName(String actorName);
    ArrayList<Movie> findByMovieByYear(int year);
    ArrayList<Movie> findByMovieByProducer(String producerName);
    ArrayList<Movie> findByMovieByGenre(Genre genre);
    ArrayList<Movie> findByMovieByRole(String role);

    ArrayList<Movie> sortByMovienName(String string);
    ArrayList<Movie> sortByYear(String string);
    ArrayList<Movie> sortByProducer(String string);




}
