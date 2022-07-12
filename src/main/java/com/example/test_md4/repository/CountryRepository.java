package com.example.test_md4.repository;

import com.example.test_md4.model.City;
import com.example.test_md4.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

}
