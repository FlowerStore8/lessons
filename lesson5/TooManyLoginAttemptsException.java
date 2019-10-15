package ru.nsu.flowerstore;
import java.io.IOException;

public class TooManyLoginAttemptsException extends IOException {
    private String message;

    public TooManyLoginAttemptsException(String message) {
        super(message);
    }

}