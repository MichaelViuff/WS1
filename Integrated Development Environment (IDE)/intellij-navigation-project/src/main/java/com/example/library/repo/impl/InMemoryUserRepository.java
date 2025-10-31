package com.example.library.repo.impl;

import com.example.library.model.LibraryUser;
import com.example.library.repo.base.BaseRepository;
import com.example.library.repo.UserRepository;

import java.util.Optional;

public class InMemoryUserRepository extends BaseRepository<LibraryUser, String> implements UserRepository {
    @Override public Optional<LibraryUser> findById(String id) { return super.findById(id); }
    @Override public void add(LibraryUser u) { data.put(u.id(), u); }
}
