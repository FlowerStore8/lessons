package ru.nsu.flowerstore;

import java.util.ArrayList;

public class Doer {

    private ArrayList<ArrayList> matrix;
    private ArrayList<Integer> vector;

    Doer() throws IncorrectInputData {
        ArrayList<ArrayList> matrix = FileWorker.read();
        assert matrix != null;
        ArrayList vector = matrix.get(matrix.size()-1);
        this.vector = vector;
        matrix.remove(matrix.size()-1);
        this.matrix = matrix;
        if(!(matrix.size() == vector.size())){
            throw new IncorrectInputData("Длина вектора не равна размерности матрицы");
        }
    }

    public ArrayList<Integer> solution(){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(ArrayList<Integer> matrixString : matrix){
            int sum = 0;
            for(int i = 0; i < matrixString.size(); i++){
                sum += matrixString.get(i)*vector.get(i);
            }
            result.add(sum);
        }
        return result;
    }

    public ArrayList<Resource> threadSolution() {
        ArrayList<Resource> threads = new ArrayList<Resource>();
        for(ArrayList matrixString : matrix){
            Resource resource = new Resource();
            MyThread thread = new MyThread();
            thread.setData(matrixString, vector, resource);
            threads.add(resource);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        return threads;
    }




}
