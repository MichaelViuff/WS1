package com.example.library.model;

import java.util.Objects;

public class Book {
    private final String isbn;
    private String title;
    private final Author author;
    private int availableCopies;

    public Book(String isbn, String title, Author author, int availableCopies) {
        this.isbn = Objects.requireNonNull(isbn);
        this.title = Objects.requireNonNull(title);
        this.author = Objects.requireNonNull(author);
        this.availableCopies = availableCopies;
    }

    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public Author getAuthor() { return author; }
    public int getAvailableCopies() { return availableCopies; }

    public void setTitle(String title) { this.title = title; }
    public void setAvailableCopies(int availableCopies) { this.availableCopies = availableCopies; }

    @Override public String toString() { return title + " (" + isbn + ")"; }
}
