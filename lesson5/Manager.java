package ru.nsu.flowerstore;

import java.io.*;
import java.util.HashMap;

public class Manager implements MailAccountManager  {

    private HashMap<String, Account> accounts = new HashMap<>();

    public void registerNewAccount (String email, String password, Person person) throws
            DuplicateAccountException, IOException {
        accounts = FileWorker.read();
        assert accounts != null;
        if(!accounts.containsKey(email)){
            Account account = new Account(password, person);
            accounts.put(email, account);
            FileWorker.write(accounts);
        }
        else{
            throw new DuplicateAccountException("Такой аккаунт существует");
        }

    }
    public void removeAccount (String email, String password) throws WrongCredentialsException {
        if(accounts.get(email).getPassword().equals(password)){
            accounts.remove(email);
            FileWorker.write(accounts);
        }
        else{
            throw new WrongCredentialsException("Неправильно введены данные");
        }

    }
    public boolean hasAccount (String email){
        return accounts.containsKey(email);
    }
    public Person getPerson (String email, String password) throws
            TooManyLoginAttemptsException {
        Account acc = accounts.get(email);
        Cooldown cooldown = Cooldown.getInstance();
        return cooldown.login(password, acc);
    }

    public int numOfAccounts () {
        accounts = FileWorker.read();
        return accounts.size();
    }
}
