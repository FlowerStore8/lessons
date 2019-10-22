package ru.nsu.flowerstore;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileWorker {

    public static ArrayList read() {
        FileReader reader = null;
        Scanner scan = null;
        try {
            reader = new FileReader("C:/new/matrix.txt");
            scan = new Scanner(reader);
            ArrayList<ArrayList>matrix = new ArrayList<>();
            while(scan.hasNextLine()){
                String matrixString = scan.nextLine();
                String[] numbers;
                ArrayList<Integer> intNumbers = new ArrayList<>();
                numbers = matrixString.split(" ");
                for (String item : numbers) {
                    int newItem = Integer.parseInt(item);
                    intNumbers.add(newItem);
                }
                matrix.add(intNumbers);
            }
            return matrix;


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

    public static void write(ArrayList vector, String fileName) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(fileName);
            writer.write(vector.toString());
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

}
