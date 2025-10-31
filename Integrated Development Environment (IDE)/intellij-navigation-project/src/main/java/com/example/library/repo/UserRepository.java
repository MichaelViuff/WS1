package com.example.library.repo;

import com.example.library.model.LibraryUser;

import java.util.Optional;

public interface UserRepository
{
    Optional<LibraryUser> findById(String id);

    void add(LibraryUser u);
}
