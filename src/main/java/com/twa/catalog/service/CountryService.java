package com.twa.catalog.service;

import com.twa.catalog.domain.Country;
import com.twa.catalog.dto.CountryDTO;
import com.twa.catalog.enums.ApiError;
import com.twa.catalog.exception.ResourceNotException;
import com.twa.catalog.repository.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CountryService {

    private CountryRepository countryRepository;
    private MapperFacade mapperFacade;

    public CountryDTO get(Long id) {
        Optional<Country> country = countryRepository.findById(id);

        if (country.isEmpty()) {
            throw new ResourceNotException(ApiError.COUNTRY_NOT_FOUND);
        }
        return mapperFacade.map(country.get(), CountryDTO.class);
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
