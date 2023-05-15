package com.kodilla;

public class SimpleArray {
        public static void main(String[] args) {
            String[] movies =new String[]{"Harry Poter","Terminator","Forest Gump"};
            String movie = movies[2];
            System.out.println(movie);
            int numebrofElements = movies.length;
            System.out.println("Moja tablica zawiera:"+ numebrofElements + " elementy");
            String[] names = new String[]{"John","Anna","Peter"};
            for(int i=names.length-1;i>=0;i--){
                System.out.println(names[i]);
            }
        }
    }

