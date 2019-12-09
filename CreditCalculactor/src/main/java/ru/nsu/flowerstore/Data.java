package ru.nsu.flowerstore;

public class Data {

    int minSum;
    int maxSum;
    int minTime;
    int maxTime;
    int rate;

    Data(int minSum, int maxSum, int minTime, int maxTime, int rate){
        this.minSum = minSum;
        this.maxSum = maxSum;
        this.minTime = minTime;
        this.maxTime = maxTime;
        this.rate = rate;
    }

    public String toSql(){
       return "('"+minSum+"', "+
                "'"+maxSum+"', "+
                "'"+minTime+"', "+
                "'"+maxTime+"')";
    }

}
