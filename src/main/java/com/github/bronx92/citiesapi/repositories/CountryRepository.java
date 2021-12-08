package com.github.bronx92.citiesapi.repositories;

import com.github.bronx92.citiesapi.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
