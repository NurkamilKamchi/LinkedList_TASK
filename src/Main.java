import Database.Database;
import ServiceImpl.MovieServiceImpl;
import models.Genre;

import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        MovieServiceImpl movieService = new MovieServiceImpl();
        Scanner scanner = new Scanner(System.in);
        Scanner scannerForNum = new Scanner(System.in);
        System.out.println("Welcome to movie side!!!");
        while (true) {
            System.out.println("""
                    1.Get all movies.
                    2.Find movie by name.
                    3.Find moie bby actor name.
                    4.Find movieByYear.
                    5.find movie by Producer.
                    6.Find movie by genre.
                    7.Find movie by role.
                    8.Sort by movie name.
                    9.Sort by year.
                    10.Sort by producer.
                    11.Exit
                                   
                    Enter your choice.
                    """);
            try {
                switch (scannerForNum.nextInt()) {
                    case 1 -> {
                        movieService.getAllMovies();
                    }
                    case 2 -> {
                        System.out.print("Enter movie name: ");
                        String name = new Scanner(System.in).nextLine();
                        if (movieService.findByMovieName(name) == null) {
                            System.out.println("Movie with this name not found!!!");
                        } else {
                            System.out.println(movieService.findByMovieName(name));
                        }
                    }
                    case 3 -> {
                        System.out.print("Enter actor name: ");
                        String name = new Scanner(System.in).nextLine();
                        if (movieService.findByMovieActorName(name) == null) {
                            System.out.println("Movie with this actor name not found!!!");
                        } else {
                            System.out.println(movieService.findByMovieActorName(name));
                        }
                    }
                    case 4 -> {
                        System.out.print("Enter published year of movie: ");
                        int yaer = scanner.nextInt();
                        if (movieService.findByMovieByYear(yaer) == null) {
                            System.out.println("Movie with this year not found!!!");
                        } else {
                            System.out.println(movieService.findByMovieByYear(yaer));
                        }
                    }
                    case 5 -> {
                        System.out.print("Enter producer name of movie: ");
                        String name = scanner.nextLine();
                        if (movieService.findByMovieByProducer(name) == null) {
                            System.out.println("Movie with this producer name not found!!!");
                        } else {
                            System.out.println(movieService.findByMovieByProducer(name));
                        }
                    }
                    case  6-> {
                        System.out.print("Enter producer name of movie: ");
                        String name = scanner.nextLine();
                        if (name.toLowerCase().contains("drama")) {
                            if (movieService.findByMovieByGenre(Genre.DRAMA) == null) {
                                System.out.println("Movie with this genre not found!!!");
                            } else {
                                System.out.println(movieService.findByMovieByGenre(Genre.DRAMA));
                            }
                        } else if (name.toLowerCase().contains("poetry")) {
                            if (movieService.findByMovieByGenre(Genre.POETRY) == null) {
                                System.out.println("Movie with this genre not found!!!");
                            } else {
                                System.out.println(movieService.findByMovieByGenre(Genre.POETRY));
                            }
                        } else {
                            System.out.println("Movie with this genre not found!!!");
                        }
                    }
                    case 7 -> {
                        System.out.print("Enter role: ");
                        String role = new Scanner(System.in).nextLine();
                        if (movieService.findByMovieByProducer(role) == null) {
                            System.out.println("Movie with this role not found!!!");
                        } else {
                            System.out.println(movieService.findByMovieByProducer(role));
                        }
                    }
                    case 9 -> {
                        System.out.print("Choose ask/desc: ");
                        String answer = scanner.nextLine();
                        movieService.sortByMovienName(answer);
                    }
                    case 10 -> {
                        System.out.print("Enter your choice  asc/ desc");
                        String answer = scanner.nextLine();
                        movieService.sortByYear(answer);
                    }
                    case 11 -> {
                        System.out.print("Enter your choice asc/ desc: ");
                        String answer = scanner.nextLine();
                        System.out.println(movieService.sortByProducer(answer));
                    }
                    case 12 -> {
                        System.exit(0);
                    }
            }

            }catch (InputMismatchException e){
                System.err.println("Write only integer type!!!");
                scannerForNum.nextLine();
            }
        }
    }
}
//Findable:
//List<Movie>getAllMovies();
//findMovieByNameOrPartName(String name);
//findMovieByActorName(String actorName);
//findMovieByYear(Year year);
//findMovieByProducer(String producerName);
//findMovieByGenre(Genre genre);
//findMovieByRole(String role);
//Sortable:
//sortByMovieName(String ascOrDesc);
//-from A to Z
//-from Z to A
//sortByYear(String ascOrDesc);
//-Ascending
//-Descending
//sortByProducer();
//Main де кайсыл иш аракетти аткаргыбыз келсе ошол метод switch case аркылуу чакырылып иштесин.
//Бардык маалыматтар туура жана так болуп консольго чыксын.