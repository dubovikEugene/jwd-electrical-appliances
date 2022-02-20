package com.epam.jwd.logic.validator;

import com.epam.jwd.entity.appliances.Appliances;

public interface Validator<T> {
    public void validate(T t);
}
