package ru.nsu.flowerstore;

import java.util.ArrayList;

public class MyThread extends Thread {

    private Resource resource;
    private ArrayList<Integer> matrixString;
    private ArrayList<Integer> vector;

    public void setData(ArrayList<Integer> matrixString, ArrayList<Integer> vector, Resource resource){
        this.matrixString = matrixString;
        this.vector = vector;
        this.resource = resource;
    }

    private void calculate(){
        int sum = 0;
        for(int i = 0; i < matrixString.size(); i++){
            sum += matrixString.get(i)*vector.get(i);
        }
        resource.setResource(sum);
    }

    @Override
    public void run() {
        calculate();
    }

}
