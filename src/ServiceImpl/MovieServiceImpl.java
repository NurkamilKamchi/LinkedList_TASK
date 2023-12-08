package ServiceImpl;

import Database.Database;
import models.Actor;
import models.Genre;
import models.Movie;
import models.Producer;
import service.impl.MovieService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class MovieServiceImpl implements MovieService {

    Database database = new Database();


    @Override
    public ArrayList<Movie> getAllMovies() {
        System.out.println(Database.movies);
        return Database.movies;
    }

    @Override
    public ArrayList<Movie> findByMovieName(String name) {
        ArrayList<Movie> movies2 = new ArrayList<>();
        for (Movie movie : Database.movies) {
            if (name.equalsIgnoreCase(movie.getName())) {
                movies2.add(movie);
            }
        }
        return movies2.isEmpty() ? null : movies2;
    }

    @Override
    public ArrayList<Movie> findByMovieActorName(String actorName) {
        ArrayList<Movie> movies3 = new ArrayList<>();
        for (Movie movie : Database.movies) {
            for (Actor actor : movie.actors) {
                if (actorName.equalsIgnoreCase(actor.getFullname())) {
                    movies3.add(movie);
                }
            }
        }
        return movies3.isEmpty() ? null : movies3;
    }

    @Override
    public ArrayList<Movie> findByMovieByYear(int year) {
        ArrayList<Movie> movies4 = new ArrayList<>();
        for (Movie movie : Database.movies) {
            if (year == movie.getYear()) {
                movies4.add(movie);
            }
        }
        return movies4.isEmpty() ? null : movies4;
    }

    @Override
    public ArrayList<Movie> findByMovieByProducer(String producerName) {
        ArrayList<Movie> movies5 = new ArrayList<>();
        for (Movie movie : Database.movies) {
            if (producerName.equalsIgnoreCase(movie.getProducer().getFirstName())) {
                movies5.add(movie);
            }
        }
        return movies5.isEmpty() ? null : movies5;
    }

    @Override
    public ArrayList<Movie> findByMovieByGenre(Genre genre) {
        ArrayList<Movie> movies5 = new ArrayList<>();
        for (Movie movie : Database.movies) {
            if (genre.equals(movie.getGenre())) {
                movies5.add(movie);
            }
        }
        return movies5.isEmpty() ? null : movies5;
    }

    @Override
    public ArrayList<Movie> findByMovieByRole(String role) {
        ArrayList<Movie> movies6 = new ArrayList<>();
        for (Movie movie : Database.movies) {
            for (Actor actor : movie.actors) {
                if (role.equals(actor.getRole())) {
                    movies6.add(movie);
                }
            }

        }
        return movies6.isEmpty() ? null : movies6;
    }


    @Override
    public ArrayList<Movie> sortByMovienName(String answer) {
        Comparator<Movie> comparator = Comparator.comparing(Movie::getName);
        if (answer.equalsIgnoreCase("asc")) {
            Database.movies.sort(comparator);
            return Database.movies;
        } else if (answer.equalsIgnoreCase("desc")) {
            Database.movies.sort(comparator.reversed());
            return Database.movies;
        }
        return null;
    }

    @Override
    public ArrayList<Movie> sortByYear(String answer) {
        Comparator<Movie> comparator = Comparator.comparing(Movie::getYear);
        if (answer.equalsIgnoreCase("asc")) {
            Database.movies.sort(comparator);
            return Database.movies;
        } else if (answer.equalsIgnoreCase("desc")) {
            Database.movies.sort(comparator.reversed());
            return Database.movies;
        }
        return null;
    }

    @Override
    public ArrayList<Movie> sortByProducer(String answer) {
        Database.movies.sort(MovieServiceImpl.comparator);
        if (answer.equalsIgnoreCase("asc")) {
            Database.movies.sort(comparator);
            return Database.movies;
        } else if (answer.equalsIgnoreCase("desc")) {
            Database.movies.sort(comparator.reversed());
            return Database.movies;
        }
        return null;
    }

    public static Comparator<Movie> comparator = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getProducer().getFirstName().compareTo(o2.getProducer().getFirstName());
        }
    };
}
//  public LinkedList<Student> sortByGradesMinimize() {
//        Comparator<Student> comparator = Comparator.comparing(Student::getBaasy).reversed();
//        System.out.println("Before sorting: " +Database.students);
//        Database.students.sort(comparator);
//        System.out.println("Sortded baasy" + Database.students);
//        return Database.students;
