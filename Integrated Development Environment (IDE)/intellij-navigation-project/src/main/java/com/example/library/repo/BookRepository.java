package com.example.library.repo;

import com.example.library.model.Book;
import com.example.library.model.LibraryUser;
import com.example.library.model.Loan;

import java.util.*;

public interface BookRepository {
    java.util.Optional<Book> findByIsbn(String isbn);
    java.util.List<Book> searchByTitle(String q);
    void add(Book book);
    void updateTitle(String isbn, String newTitle);
}

