package com.github.bronx92.citiesapi.repository;

import com.github.bronx92.citiesapi.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
