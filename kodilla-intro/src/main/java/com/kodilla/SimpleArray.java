package com.kodilla;

public class SimpleArray {
        public static void main(String[] args) {
            String[] movies = new String[5];
            movies[0] = "Harry";
            movies[1] = "Lord";
            movies[2] = "Forrest Gump";
            movies[3] = "Harry Potter";
            movies[4] = "Lord of the Rings";
            String movie = movies[4];
            System.out.println(movie);
            int numberOfElements = movies.length;
            System.out.println(numberOfElements);
        }
    }

