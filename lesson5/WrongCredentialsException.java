package ru.nsu.flowerstore;

import java.io.IOException;

public class WrongCredentialsException extends IOException {
    private String message;

    public WrongCredentialsException(String message) {
        super(message);
    }
}
