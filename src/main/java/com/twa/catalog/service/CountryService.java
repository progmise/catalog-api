package com.twa.catalog.service;

import com.twa.catalog.dto.CountryDTO;
import com.twa.catalog.enums.ApiError;
import com.twa.catalog.exception.ResourceNotException;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    public CountryDTO get(Long id) {
        if (id != 1) {
            throw new ResourceNotException(ApiError.COUNTRY_NOT_FOUND);
        }
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
