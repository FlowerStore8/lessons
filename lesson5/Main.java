package ru.nsu.flowerstore;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
		Manager manager = new Manager();
		Person person = new Person("Andrew", "08.02.2000");
		//manager.registerNewAccount("ankoz", "123", person);
		//manager.registerNewAccount("ankoss", "123", person);
		System.out.println(manager.numOfAccounts());
		manager.getPerson("a", "b");
		manager.getPerson("a", "b");
		manager.getPerson("a", "b");
		manager.getPerson("a", "b");
		manager.getPerson("a", "b");
		System.out.println(manager.getPerson("ankoz", "123"));

    }
}