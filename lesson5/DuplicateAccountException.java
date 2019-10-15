package ru.nsu.flowerstore;

public class DuplicateAccountException extends RuntimeException {
    private String message;

    public DuplicateAccountException(String message){
        super(message);
    }
}