package com.example.test_md4.service;

import com.example.test_md4.model.City;
import com.example.test_md4.model.Country;
import com.example.test_md4.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CountryServiceImpl implements GeneralService<Country> {
    @Autowired
    CountryRepository countryRepository;


    @Override
    public Iterable<Country> findAll() {
        return countryRepository.findAll();
    }

    @Override
    public Optional<Country> findById(Long id) {
        return countryRepository.findById(id);
    }

    @Override
    public void save(Country country) {
    countryRepository.save(country);
    }

    @Override
    public void remove(Long id) {
    countryRepository.deleteById(id);
    }
}

