package com.twa.catalog.exception;

import com.twa.catalog.enums.ApiError;

public class DuplicateResourceException extends TWAException {

    public DuplicateResourceException(ApiError error) {
        super(error.getHttpStatus(), error.getMessage(), null);
    }
}