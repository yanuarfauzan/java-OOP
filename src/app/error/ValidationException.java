package app.error;

public class ValidationException extends Throwable {
    private String name;

    public ValidationException(String message)
    {
        super(message);
    }
}
