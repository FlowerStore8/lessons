package ru.nsu.flowerstore;

import java.util.HashMap;

public class Cooldown {
    private static Cooldown instance;
    private int counter;

    private Cooldown(){
        counter = 0;
    }

    public Person login(String password, Account acc) throws TooManyLoginAttemptsException {
        if(acc != null) {
            if (!acc.getPassword().equals(password)) {
                counter++;
            } else {
                    counter = 0;
                return acc.getPerson();
            }
        }
        counter++;
        if (counter > 5) {
            throw new TooManyLoginAttemptsException("Превышен лимит попыток входа");
        }
        return null;
    }

    public static Cooldown getInstance(){
        if(instance == null){
            instance = new Cooldown();
        }
        return instance;
    }


}
