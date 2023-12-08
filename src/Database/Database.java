package Database;

import models.Actor;
import models.Genre;
import models.Movie;
import models.Producer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Database {
    static Producer producer = new Producer("Ruslan", "Akun");
    static Producer producer2 = new Producer("Ernest", "Abdyjaparov");
    static Producer producer3 = new Producer("Radk ", "Eshomov");
    static Producer producer4 = new Producer("Nurlan", "Koyanbaev");
    static Actor actor = new Actor("Urmat", "Urmat Programmer");
    static Actor actor2 = new Actor("Akylai", "Akilai Reader");
    static Actor actor3 = new Actor("Dastan", "Dastan bratan");
    static Actor actor4 = new Actor("Aibek", "Atchan ayildyk");
    static Actor actor5 = new Actor("Sezim", "Suluu Shaardyk");
    static Actor actor6 = new Actor("Baltabek", "Ayildyk balkon");
    static Actor actor7 = new Actor("Rysbek", "Loh kuyoo");
    static Actor actor8 = new Actor("Aijamal", "Umnitsa ayal");
    static Actor actor9 = new Actor("Ermek", "Povor");
    static Actor actor10 = new Actor("Nurlan Ozu", "Gen director");
    static Actor actor11 = new Actor("Aldiyar", "Tupoi pomoshnik");
    static Actor actor12 = new Actor("Gulya", "Kelin bala");
    static ArrayList<Actor> actorsAkyrkySabak = new ArrayList<>(Arrays.asList(actor, actor2, actor3));
    static ArrayList<Actor> actorsBozSalkyn = new ArrayList<>(Arrays.asList(actor4, actor5, actor6));
    static ArrayList<Actor> actorsKoshunanlar = new ArrayList<>(Arrays.asList(actor7, actor8, actor9));
    static ArrayList<Actor> actorsBinesPoKazahski = new ArrayList<>(Arrays.asList(actor10, actor11, actor12));


    public static ArrayList<Movie> movies = new ArrayList<>(Arrays.asList(
            new Movie("Akyrky sabak", 2021, Genre.POETRY, producer, actorsAkyrkySabak),
            new Movie("Boz salkyn", 2002, Genre.DRAMA, producer2, actorsBozSalkyn),
            new Movie("Koshunalar ", 2020, Genre.DRAMA, producer3, actorsKoshunanlar),
            new Movie("Biznes po kazahskiy", 2019, Genre.POETRY, producer4, actorsBinesPoKazahski)
    ));
}

