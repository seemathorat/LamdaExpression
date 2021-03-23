package com;
import java.util.regex.Pattern;
@FunctionalInterface
interface UserRegistrationSystem {
    boolean validate(String s);
}
class UserValidator {
    private static String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    final String EMAIL_PATTERN = "^[a-zA-Z0-9]+(([\\.+-][a-z0-9]{1,})?)+@(?:[a-zA-Z0-9])+\\.[a-zA-Z]{2,4}+((\\.[a-z]{2,4})?)$";
    final String MOBILE_PATTERN = "[91]+[s]+[0-9]{10}";
    final String PASSWORD1_PATTERN = "[a-z A-Z 0-9]{8,}";

    UserRegistrationSystem firstNameIsValid = (s) -> (Pattern.compile(NAME_PATTERN).matcher(s).matches());
    UserRegistrationSystem firstNameIsInValid = (s) -> (Pattern.compile(NAME_PATTERN).matcher(s).matches());

    UserRegistrationSystem lastNameIsValid = (s) -> (Pattern.compile(NAME_PATTERN).matcher(s).matches());
    UserRegistrationSystem lastNameIsInValid = (s) -> (Pattern.compile(NAME_PATTERN).matcher(s).matches());

    UserRegistrationSystem emailIsValid = (s) -> (Pattern.compile(EMAIL_PATTERN).matcher(s).matches());
    UserRegistrationSystem emailIsInValid = (s) -> (Pattern.compile(EMAIL_PATTERN).matcher(s).matches());

    UserRegistrationSystem mobileNumberIsValid = (s) -> (Pattern.compile(MOBILE_PATTERN).matcher(s).matches());
    UserRegistrationSystem mobileNumberIsInValid = (s) -> (Pattern.compile(MOBILE_PATTERN).matcher(s).matches());

    UserRegistrationSystem passwordIsValid = (s) -> (Pattern.compile(PASSWORD1_PATTERN).matcher(s).matches());
    UserRegistrationSystem passwordIsInValid = (s) -> (Pattern.compile(PASSWORD1_PATTERN).matcher(s).matches());
}
