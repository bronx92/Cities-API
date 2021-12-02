package com.github.bronx92.citiesapi.controller;

import com.github.bronx92.citiesapi.model.Country;
import com.github.bronx92.citiesapi.repository.CountryRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    private CountryRepository repository;

    public CountryResource(CountryRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Page<Country> countries(Pageable page) {
        return repository.findAll(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity getOne(@PathVariable Long id) {
        Optional<Country> optional = repository.findById(id);
        if (optional.isPresent()) {
            return ResponseEntity.ok().body(optional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    // o método poderia ser feito das seguintes formas:
    /*
        public Optional<Country> getOne(@PathVariable Long id) {
            return repository.findById(id);
        }
        Ou
        public Country getOne(@PathVariable Long id) {
            Optional<Country> optional = repository.findById(id);
            return optional.get();
        }
        Mas fazendo dessas maneiras não há um tratamento de exceção para o caso de busca por um id não existente, que nesse caso é feito pelo ResponseEntity
    */
}
