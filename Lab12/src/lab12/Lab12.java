package lab12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie implements Comparable<Movie>  {
    private double rating;
    private String name;
     int year;
    
    public Movie(String name,double rating,int year){
        this.name=name;
        this.rating=rating;
        this.year=year;
    }
    
    public double getRating(){return rating;}
    public String getName(){return name;}
    public int getYear(){return year;}

    @Override
    public int compareTo(Movie m) {
        return m.year-year;
    }
}

class RatingCompare implements Comparator<Movie> {
    @Override
    public int compare(Movie a, Movie b) {
        return Double.compare(b.getRating(), a.getRating());
    }
}

class NameCompare implements Comparator<Movie> {
    @Override
    public int compare(Movie a, Movie b) {
        return a.getName().compare(b.getName());
    }
}
public class Lab12 {

    public static void main(String[] args) {
       ArrayList<Movie> list = new ArrayList<>();

        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        // Sort by rating
        System.out.println("Sorted by rating:");
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list, ratingCompare);
        list.forEach((movie) -> {
            System.out.println(movie.getRating() + " " + movie.getName() + " " + movie.getYear());
        });

        // Sort by name
        System.out.println("\nSorted by name:");
        NameCompare nameCompare = new NameCompare();
        Collections.sort(list, nameCompare);
        list.forEach((movie) -> {
            System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
        });

        // Uses Comparable to sort by year
        System.out.println("\nSorted by year:");
        Collections.sort(list);
        list.forEach((movie) -> {
            System.out.println(movie.getYear() + " " + movie.getRating() + " " + movie.getName());
        });
    }
}