package com.github.bronx92.citiesapi.repository;

import com.github.bronx92.citiesapi.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
