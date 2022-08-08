package com.twa.catalog.exception;

import com.twa.catalog.enums.ApiError;
import org.springframework.http.HttpStatus;

import java.util.List;

public class ResourceNotException extends TWAException {

    public ResourceNotException(ApiError error) {
        super(error.getHttpStatus(), error.getMessage(), null);
    }
}
