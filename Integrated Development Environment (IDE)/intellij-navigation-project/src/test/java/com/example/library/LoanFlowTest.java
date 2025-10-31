package com.example.library;

import com.example.library.model.*;
import com.example.library.notify.EmailNotifier;
import com.example.library.repo.impl.*;
import com.example.library.service.LoanService;
import com.example.library.service.policy.ChildrenLoanPolicy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoanFlowTest {

    @Test
    void borrow_reduces_copies(){
        var books = new InMemoryBookRepository();
        var users = new InMemoryUserRepository();
        var loans = new InMemoryLoanRepository();
        var policy = new ChildrenLoanPolicy();
        var notifier = new EmailNotifier();
        var service = new LoanService(books, users, loans, policy, notifier);

        books.add(new Book("42", " The  Pragmatic  Programmer  ", new Author("Hunt & Thomas"), 1));
        users.add(new LibraryUser("u1","Alex", true));

        assertTrue(service.borrow("42","u1"));
    }
}
