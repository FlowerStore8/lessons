package ru.nsu.flowerstore;

public class MyThread extends Thread {

    Resource resource;

    public void setResource(Resource resource){
        this.resource = resource;
    }

    private synchronized void changeResource() throws InterruptedException {
        sleep(1000);
        resource.changeNum();
    }


    public void run(){
        try {
            changeResource();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
