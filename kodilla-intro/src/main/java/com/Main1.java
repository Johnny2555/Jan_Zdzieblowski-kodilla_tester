package com;

public class Main1 {
    public static void main (String[] args){
        Book book = Book.of("Isaac Asimov", "The Galaxy");
        System.out.println(book.getAuthor());
        System.out.println(book.getTitle());

    }
}
