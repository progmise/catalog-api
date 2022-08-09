package com.twa.catalog.controller;

import com.twa.catalog.controller.resources.CountryResource;
import com.twa.catalog.dto.CountryDTO;
import com.twa.catalog.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/country")
public class CountryController implements CountryResource {

    private CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    public ResponseEntity<CountryDTO> get(@PathVariable Long id) {
        CountryDTO response = countryService.get(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public ResponseEntity<CountryDTO> save(@RequestBody @Validated CountryDTO country) {
        CountryDTO response = countryService.save(country);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public ResponseEntity<CountryDTO> update(@PathVariable Long id, @RequestBody @Validated CountryDTO country) {
        CountryDTO response = countryService.update(id, country);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        countryService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
