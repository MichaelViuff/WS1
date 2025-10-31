package com.example.library.repo.impl;

import com.example.library.model.Book;
import com.example.library.repo.BookRepository;
import com.example.library.repo.base.BaseRepository;

import java.util.*;
import java.util.stream.Collectors;

public class InMemoryBookRepository extends BaseRepository<Book, String> implements BookRepository {
    @Override public Optional<Book> findByIsbn(String isbn) { return Optional.ofNullable(data.get(isbn)); }
    @Override public List<Book> searchByTitle(String q) {
        return data.values().stream().filter(b -> b.getTitle().toLowerCase().contains(q.toLowerCase()))
                .collect(Collectors.toList());
    }
    @Override public void add(Book book) { data.put(book.getIsbn(), book); }
    @Override public void updateTitle(String isbn, String newTitle) { Optional.ofNullable(data.get(isbn)).ifPresent(b -> b.setTitle(newTitle)); }
}
