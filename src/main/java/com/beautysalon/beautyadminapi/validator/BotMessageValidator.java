package com.beautysalon.beautyadminapi.validator;

import com.beautysalon.beautyadminapi.entity.BotMessageEntity;
import com.beautysalon.beautyadminapi.exception.ValidationException;
import org.springframework.stereotype.Component;

@Component
public class BotMessageValidator extends AbstractValidator<BotMessageEntity> {

    @Override
    public void validateCreating(BotMessageEntity botMessageEntity) throws ValidationException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void validateUpdating(BotMessageEntity botMessageEntity) throws ValidationException {
        throw new UnsupportedOperationException();
    }

}
