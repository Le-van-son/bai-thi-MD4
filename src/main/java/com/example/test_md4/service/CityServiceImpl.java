package com.example.test_md4.service;

import com.example.test_md4.model.City;
import com.example.test_md4.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CityServiceImpl implements GeneralService<City> {
    @Autowired
    CityRepository cityRepository;


    @Override
    public Iterable<City> findAll() {
        return cityRepository.findAll();
    }

    @Override
    public Optional<City> findById(Long id) {
        return cityRepository.findById(id);
    }

    @Override
    public void save(City city) {
    cityRepository.save(city);
    }


    @Override
    public void remove(Long id) {
    cityRepository.deleteById(id);
    }
}

