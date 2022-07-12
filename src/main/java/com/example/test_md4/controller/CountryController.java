package com.example.test_md4.controller;

import com.example.test_md4.model.Country;
import com.example.test_md4.service.CountryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;


@RestController
@CrossOrigin("*")
@RequestMapping("/country")
public class CountryController {
@Autowired
private CountryServiceImpl countryService;
@GetMapping("")
public ResponseEntity<Iterable<Country>> showAllCountry() {
    Iterable<Country> countries = countryService.findAll();
    return new ResponseEntity<>(countries, HttpStatus.OK);
}
}
