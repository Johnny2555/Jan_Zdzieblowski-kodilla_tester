package com.kodilla.parametrized_tests.homework;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {
    private UserValidator validationUtils = new UserValidator();
    @ParameterizedTest
    @CsvSource({"john.doe,true","johndoe123,true","john@doe,false","jo,false"})
    void validateUsername(String username, boolean expected){
        boolean result = validationUtils.validateUsername(username);
        assertEquals(expected,result);
    }
    @ParameterizedTest
    @CsvSource({"test@example.com,true","test,false","test@example, false","test.example@com, false",
            "test@example.co.uk, true", "test@example..com, false"})
    void validateEmail(String email, boolean expected){
        boolean result = validationUtils.validateEmail(email);
        assertEquals(expected,result);
    }

}