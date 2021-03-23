package com;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserValidationTest {

    @Test
    public void firstNameIsValid() {
        UserValidator userValidator = new UserValidator();
        boolean result = true;
        result = userValidator.firstNameIsValid.validate("Seema");
        Assertions.assertTrue(result);
    }
}
