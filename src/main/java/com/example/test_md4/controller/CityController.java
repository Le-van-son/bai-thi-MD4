package com.example.test_md4.controller;

import com.example.test_md4.model.City;
import com.example.test_md4.service.CityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/city")
public class CityController {
    @Autowired
    private CityServiceImpl cityService;

    @GetMapping
    public ResponseEntity<Iterable<City>> showAllCity() {
        Iterable<City> cities = cityService.findAll();
        return new ResponseEntity<>(cities, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<City> saveCity(@RequestBody City city) {
        cityService.save(city);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

//edit
@PutMapping("/edit")
public ResponseEntity<City> edit(@RequestBody City city) {
    cityService.save(city);
    return new ResponseEntity<>(city, HttpStatus.OK);
}

    @DeleteMapping("/{id}")
    public ResponseEntity<City> deleteCity(@PathVariable Long id) {
        cityService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
