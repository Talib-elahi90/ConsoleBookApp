package com.talibelahi.consolebookapp;

import java.math.BigDecimal;
import java.util.Arrays;

public class ConsoleBookApp {

    public static void main(String[] args) {
        Book[] books = new Book[]{
            new Book(1, "Book_1", new Author[]{new Author(1, "Ali", "Siddique")},
            new Publisher(1, "Publisher_1"), 1999, 270,
            BigDecimal.valueOf(350), CoverType.Paperback)
        };
        
        BookService bs = new BookService();
        System.out.println(Arrays.toString(bs.filterBookByAuthor(new Author(1, "Ali", "Siddique"), books)));
    }
}
