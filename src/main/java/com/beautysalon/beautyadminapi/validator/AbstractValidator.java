package com.beautysalon.beautyadminapi.validator;

import com.beautysalon.beautyadminapi.exception.ValidationException;

import java.util.List;

import static java.util.Objects.isNull;

public abstract class AbstractValidator<T> {

    public abstract void validateCreating(T t) throws ValidationException;

    public abstract void validateUpdating(T t) throws ValidationException;

    public void validateId(Integer id) throws ValidationException {
        if (isNull(id) || id <= 0) {
            throw new ValidationException("Invalid id: " + id);
        }
    }

}
