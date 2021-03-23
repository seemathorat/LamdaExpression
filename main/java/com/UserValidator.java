package com;
import java.util.regex.Pattern;
@FunctionalInterface
interface UserRegistrationSystem {
    boolean validate(String s);
}
class UserValidator {
    private static String NAME_PATTERN = "^[A-Z][a-z]{2,}$";

    UserRegistrationSystem firstNameIsValid = (s) -> (Pattern.compile(NAME_PATTERN).matcher(s).matches());
    UserRegistrationSystem firstNameIsInValid = (s) -> (Pattern.compile(NAME_PATTERN).matcher(s).matches());

    UserRegistrationSystem lastNameIsValid = (s) -> (Pattern.compile(NAME_PATTERN).matcher(s).matches());
    UserRegistrationSystem lastNameIsInValid = (s) -> (Pattern.compile(NAME_PATTERN).matcher(s).matches());
}
