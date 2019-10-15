package ru.nsu.flowerstore;

import java.io.IOException;

public interface MailAccountManager {

    void registerNewAccount(String email, String password, Person person) throws
            DuplicateAccountException, IOException;
    void removeAccount(String email, String password) throws WrongCredentialsException;
    boolean hasAccount(String email);
    Person getPerson(String email, String password) throws
            TooManyLoginAttemptsException;
    int numOfAccounts();

}
