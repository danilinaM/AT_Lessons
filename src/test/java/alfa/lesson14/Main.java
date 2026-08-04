package alfa.lesson14;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie("Интерстеллар", 8.7));
        movies.add(new Movie("Шрек", 8.1));
        movies.add(new Movie("Начало", 8.8));
        movies.add(new Movie("Веном", 6.6));

        System.out.println("Before sort: ");
        for (Movie m : movies) {
            System.out.println(m);
        }
        System.out.println("After sort: ");
        movies.sort(new MovieRatingComparator());
        for (Movie m : movies) {
            System.out.println(m);
        }
    }
}
