package app.application;

import app.data.LoginRequest;
import app.error.ValidationException;
import app.utils.ValidationUtils;

public class ValidationApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest(null, null);
        try {
            ValidationUtils.validate(loginRequest);
            System.out.println("data valid");
        } catch (ValidationException e) {
            System.out.println("Terjadi error dengan pesan " + e.getMessage());
        } finally {
            System.out.println("Selalu di eksekusi");
        }
    }
}
