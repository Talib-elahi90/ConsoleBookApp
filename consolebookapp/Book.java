package com.talibelahi.consolebookapp;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;

public class Book {

    private int id; // - unique identifier
    private String name; // - name of a book
    private Author[] authors; // - array of authors 
    private Publisher publisher; // - book publisher
    private int publishingYear; // - year of publishing
    private int amountOfPages; // - amount of pages 
    private BigDecimal price; // - price of a book
    private CoverType coverType; // - type of book binding, enum (Paperback , Hardcover)

    public Book() {
    }

    public Book(
            int id,
            String name,
            Author[] authors,
            Publisher publisher,
            int publishingYear,
            int amountOfPages,
            BigDecimal price,
            CoverType coverType
    ) {
        super();
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.publisher = publisher;
        this.publishingYear = publishingYear;
        this.amountOfPages = amountOfPages;
        this.price = price;
        this.coverType = coverType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public void setAmountOfPages(int amountOfPages) {
        this.amountOfPages = amountOfPages;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public CoverType getCoverType() {
        return coverType;
    }

    public void setCoverType(CoverType coverType) {
        this.coverType = coverType;
    }

    @Override
    public String toString() {
        return "Book{"
                + "id=" + id
                + ", name=" + name
                + ", authors=" + authors
                + ", publisher=" + publisher
                + ", publishingYear=" + publishingYear
                + ", amountOfPages=" + amountOfPages
                + ", price=" + price
                + ", coverType=" + coverType + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                name,
                Arrays.deepHashCode(authors),
                publisher,
                publishingYear,
                amountOfPages,
                price,
                coverType
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book other = (Book) obj;

        return id == other.id
                && publishingYear == other.publishingYear
                && amountOfPages == other.amountOfPages
                && Objects.equals(name, other.name)
                && Arrays.deepEquals(authors, other.authors)
                && Objects.equals(publisher, other.publisher)
                && Objects.equals(price, other.price)
                && coverType == other.coverType;
    }

    public boolean hasAuthor(Author authorCriteria) {
        for (Author author : authors) {
            if (author.equals(authorCriteria)) {
                return true;
            }
        }
        return false;
    }
}
