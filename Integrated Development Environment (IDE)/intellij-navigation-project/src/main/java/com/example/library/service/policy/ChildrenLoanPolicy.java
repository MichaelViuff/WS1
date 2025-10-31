package com.example.library.service.policy;

import com.example.library.model.Book;
import com.example.library.model.LibraryUser;

public class ChildrenLoanPolicy implements LoanPolicy {
    @Override public int maxDays(LibraryUser user, Book book) { return user.child() ? 21 : 7; }
}
