package com.example.library.service.policy;

import com.example.library.model.Book;
import com.example.library.model.LibraryUser;

public class StandardLoanPolicy implements LoanPolicy {
    @Override public int maxDays(LibraryUser user, Book book) { return 14; }
}
