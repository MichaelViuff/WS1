package com.example.library.repo.impl;

import com.example.library.model.Book;
import com.example.library.repo.BookRepository;

import java.util.*;

public class SqlBookRepository implements BookRepository {
    @Override public Optional<Book> findByIsbn(String isbn) { throw new UnsupportedOperationException("Demo only"); }
    @Override public List<Book> searchByTitle(String q) { throw new UnsupportedOperationException("Demo only"); }
    @Override public void add(Book book) { throw new UnsupportedOperationException("Demo only"); }
    @Override public void updateTitle(String isbn, String newTitle) { throw new UnsupportedOperationException("Demo only"); }
}
