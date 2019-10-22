package ru.nsu.flowerstore;

public class Resource {

    private int num;

    public synchronized void setNum(int num){
        this.num = num;
    }

    public void changeNum() {
        synchronized (this) {
            int num = this.num;
            num++;
            this.num = num;
        }
    }

    public int getNum() {
        return num;
    }
}
