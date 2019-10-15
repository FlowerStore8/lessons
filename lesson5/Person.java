package ru.nsu.flowerstore;

public class Person {

    private String name;
    private String date;

    public Person(String name, String date) {
        this.name = name;
        this.date = date;
    }

    @Override
    public String toString() {
        return name + ' ' + date;
    }
}
