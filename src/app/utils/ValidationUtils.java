package app.utils;

import app.data.LoginRequest;
import app.error.BlankException;
import app.error.ValidationException;

public class ValidationUtils {
    public static void validate(LoginRequest loginRequest) throws ValidationException {
        if (loginRequest.username() == null) {
            throw new ValidationException("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationException("Username is blank");
        } else if (loginRequest.password() == null) {
            throw new ValidationException("Password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new ValidationException("Password is blank");
        }

    }

    public static void validationReflection(Object object)
    {
        
    }
}