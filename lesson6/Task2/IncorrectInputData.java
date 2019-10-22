package ru.nsu.flowerstore;

public class IncorrectInputData extends Exception{
    private String message;

    IncorrectInputData(String message){
        super(message);
    }
}
