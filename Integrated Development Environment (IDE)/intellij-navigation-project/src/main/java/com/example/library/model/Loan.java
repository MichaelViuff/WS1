package com.example.library.model;

import java.time.LocalDate;

public class Loan {
    private final String isbn;
    private final String userId;
    private final LocalDate borrowed;
    private LocalDate due;

    public Loan(String isbn, String userId, LocalDate borrowed, LocalDate due) {
        this.isbn = isbn; this.userId = userId; this.borrowed = borrowed; this.due = due;
    }
    public String getIsbn() { return isbn; }
    public String getUserId() { return userId; }
    public LocalDate getBorrowed() { return borrowed; }
    public LocalDate getDue() { return due; }
    public void setDue(LocalDate due) { this.due = due; }
}
