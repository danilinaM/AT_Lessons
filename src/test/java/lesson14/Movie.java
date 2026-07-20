package lesson14;

import java.util.Objects;

public class Movie {

    private double rating;
    private String name;

    public Movie(String name,double rating) {
        this.rating = rating;
        this.name = name;
    }

    public Movie() {
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Movie info: " +
                "rating=" + rating +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return rating == movie.rating && Objects.equals(name, movie.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rating, name);
    }
}
