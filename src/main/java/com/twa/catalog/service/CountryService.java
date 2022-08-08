package com.twa.catalog.service;

import com.twa.catalog.dto.CountryDTO;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    public CountryDTO get(Long id) {
        return new CountryDTO(1L, "asd", "asd");
    }

    public CountryDTO save(CountryDTO country) {
        return country;
    }

    public CountryDTO update(Long id, CountryDTO country) {
        return country;
    }

    public void delete(Long id) {
        // TODO: Add logic
    }
}
