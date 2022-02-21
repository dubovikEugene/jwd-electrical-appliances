package com.epam.jwd.logic.validator;

/**
 * This interface is for validating the fields of a class of type T.
 * It is necessary to check all possible fields for the correctness of the entered data
 *
 * @param <T> the type of objects that may be validated by this validator
 * @author Yauheni Dubovik
 */
public interface Validator<T> {

    /**
     * Checking the fields for the correctness of the entered data
     *
     * @param t some object of type T
     */
    void validate(T t);
}
