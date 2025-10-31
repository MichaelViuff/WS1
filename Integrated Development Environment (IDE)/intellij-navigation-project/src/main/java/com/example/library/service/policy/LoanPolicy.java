package com.example.library.service.policy;

import com.example.library.model.Book;
import com.example.library.model.LibraryUser;

public interface LoanPolicy {
    int maxDays(LibraryUser user, Book book);
}
