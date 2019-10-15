package ru.nsu.flowerstore;

public class Account {

    private String password;
    private Person person;

    Account(String password, Person person){
        this.password = password;
        this.person = person;
    }

    public String getPassword() {
        return password;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return password + ';' + person.toString();
    }
}
