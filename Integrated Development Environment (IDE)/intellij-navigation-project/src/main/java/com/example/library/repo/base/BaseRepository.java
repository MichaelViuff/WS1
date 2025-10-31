package com.example.library.repo.base;

import java.util.*;

public abstract class BaseRepository<T, K> {
    protected final Map<K, T> data = new HashMap<>();
    public Optional<T> findById(K id){ return Optional.ofNullable(data.get(id)); }
}
