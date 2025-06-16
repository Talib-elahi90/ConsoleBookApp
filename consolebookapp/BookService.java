package com.talibelahi.consolebookapp;

public class BookService {

    public Book[] filterBookByAuthor(Author author, Book[] books) {
        if (author == null || books == null) {
            return new Book[0]; // Return empty array if input is invalid
        }

        int matchCount = 0;

        // First pass: Count matching books
        for (Book book : books) {
            if (book.hasAuthor(author)) {
                matchCount++;
            }
        }

        Book[] matchingBooks = new Book[matchCount];
        int index = 0;

        // Second pass: Collect matching books
        for (Book book : books) {
            if (book.hasAuthor(author)) {
                matchingBooks[index++] = book;
            }
        }
        return matchingBooks;
    }

    public Book[] filterBookByPublisher(Publisher publisher, Book[] books) {
        if (publisher == null || books == null) {
            return new Book[0]; // Return empty array if input is invalid
        }

        int matchCount = 0;

        // Count matching books
        for (Book book : books) {
            if (book.getPublisher().equals(publisher)) {
                matchCount++;
            }
        }

        Book[] matchingBooks = new Book[matchCount];
        int index = 0;

        // Collect matching books
        for (Book book : books) {
            if (book.getPublisher().equals(publisher)) {
                matchingBooks[index++] = book;
            }
        }
        return matchingBooks;
    }

    public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
        if (books == null) {
            return new Book[0];
        }

        int matchCount = 0;

        // Count books published after or in the given year
        for (Book book : books) {
            if (book.getPublishingYear() >= yearFromInclusively) {
                matchCount++;
            }
        }

        Book[] matchingBooks = new Book[matchCount];
        int index = 0;
        for (Book book : books) {
            if (book.getPublishingYear() >= yearFromInclusively) {
                matchingBooks[index++] = book;
            }
        }

        return matchingBooks;
    }
}
