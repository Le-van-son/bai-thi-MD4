package com.example.test_md4.service;

import com.example.test_md4.model.City;

import java.util.Optional;

public interface GeneralService<T> {
    public Iterable<T> findAll();
    public Optional<T> findById(Long id);
    public void save(T t);
    public void remove(Long id);
}

