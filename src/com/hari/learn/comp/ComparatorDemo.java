package com.hari.learn.comp;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie(1, "Suresh", 9234.67));
        movieList.add(new Movie(2, "Ajay", 5234.67));
        movieList.add(new Movie(3, "Hari", 6234.67));
        movieList.add(new Movie(4, "Durga", 7234.67));

        Collections.sort(movieList, new SortByName());

        movieList.forEach(System.out::println);
    }
}

@Data
class Movie {
    private int id;
    private String name;
    private double rating;

    public Movie(int id, String name, double rating) {
        this.id = id;
        this.name = name;
        this.rating = rating;
    }
}

class SortByName implements Comparator<Movie> {

    @Override
    public int compare(Movie movie1, Movie movie2) {
        return movie1.getName().compareTo(movie2.getName());
    }
}

class SortByRating implements Comparator<Movie> {

    @Override
    public int compare(Movie movie1, Movie movie2) {
        if (movie1.getRating() > movie2.getRating()) {
            return 1;
        } else if (movie1.getRating() < movie2.getRating()) {
            return -1;
        } else
            return 0;
    }
}

class SortById implements Comparator<Movie> {

    @Override
    public int compare(Movie movie1, Movie movie2) {
        if (movie1.getId() > movie2.getId()) {
            return 1;
        } else if (movie1.getId() < movie2.getId()) {
            return -1;
        } else
            return 0;
    }
}