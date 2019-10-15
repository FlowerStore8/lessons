package ru.nsu.flowerstore;

import javafx.scene.paint.Stop;

import java.io.FileReader;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class FileWorker {

    public static void write(HashMap<String, Account> accounts) {
        FileWriter writer = null;

        try {
            writer = new FileWriter("C:/new/data.csv");
            String toWrite = accounts.toString();
            toWrite = toWrite.substring(1, toWrite.length()-1);
            writer.write(toWrite);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                assert writer != null;
                writer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
    }

    public static HashMap<String, Account> read() {
        FileReader reader = null;
        Scanner scan = null;
        try {
            reader = new FileReader("C:/new/data.csv");
            scan = new Scanner(reader);
            HashMap<String, Account> accounts = new HashMap<>();
            if(scan.hasNextLine()) {
                String acc = scan.nextLine();
                String[] accs;
                accs = acc.split(",");
                for (String item : accs) {
                    String[] res = item.split("=");
                    String[] data = res[1].split(";");
                    String password = data[0];
                    String [] pers = data[1].split(" ");
                    String name = pers[0];
                    String date = pers[1];
                    Account toPut = new Account(password, new Person(name, date));
                    accounts.put(res[0], toPut);
                }
            }
            return accounts;

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                assert reader != null;
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
    }
        return null;
}

}

