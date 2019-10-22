package ru.nsu.flowerstore;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws IncorrectInputData, InterruptedException {
        Doer ob = new Doer();
        long startTime = System.nanoTime();
        ArrayList result = ob.solution();
        long stopTime = System.nanoTime();
        for (Object item : result) {
            System.out.println(item);
        }
        System.out.println("\nNo threads: " + (stopTime - startTime) + "\n");
        FileWorker.write(result, "C:/new/no.txt");

        startTime = System.nanoTime();
        result = ob.threadSolution();
        stopTime = System.nanoTime();
        for (Object item : result) {
            System.out.println(item);
        }
        System.out.println("\nThreads: " + (stopTime - startTime));
        FileWorker.write(result, "C:/new/yes.txt");
    }

}
