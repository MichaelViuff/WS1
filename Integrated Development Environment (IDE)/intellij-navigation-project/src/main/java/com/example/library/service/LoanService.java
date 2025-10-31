package com.example.library.service;

import com.example.library.model.*;
import com.example.library.notify.Notifier;
import com.example.library.repo.*;
import com.example.library.service.policy.LoanPolicy;
import com.example.library.util.TextUtils;

import java.time.LocalDate;
import java.util.Objects;

public class LoanService {
    private final BookRepository books;
    private final UserRepository users;
    private final LoanRepository loans;
    private final LoanPolicy policy;
    private final Notifier notifier;

    public LoanService(BookRepository books, UserRepository users, LoanRepository loans, LoanPolicy policy, Notifier notifier) {
        this.books = Objects.requireNonNull(books);
        this.users = Objects.requireNonNull(users);
        this.loans = Objects.requireNonNull(loans);
        this.policy = Objects.requireNonNull(policy);
        this.notifier = Objects.requireNonNull(notifier);
    }

    public boolean borrow(String isbn, String userId){
        var user = users.findById(userId).orElse(null);
        var book = books.findByIsbn(isbn).orElse(null);
        if(user == null || book == null || book.getAvailableCopies() <= 0) return false;
        int days = policy.maxDays(user, book);
        String title = TextUtils.normalizeTitle(book.getTitle());
        loans.add(new Loan(isbn, userId, LocalDate.now(), LocalDate.now().plusDays(days)));
        book.setAvailableCopies(book.getAvailableCopies() - 1);
        notifier.send(userId, "Borrowed: " + title + " for " + days + " days");
        return true;
    }
}
