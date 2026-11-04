package task3.exceptions;

public class UnknownAnimalException extends RuntimeException {

    public UnknownAnimalException(String message) {
        super(message);
    }
}
