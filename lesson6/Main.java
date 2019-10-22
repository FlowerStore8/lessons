package ru.nsu.flowerstore;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        Resource resource = new Resource();
        resource.setNum(0);
        MyThread thread = new MyThread();
        System.out.println(thread.getState());
        MyThread thread1 = new MyThread();
        thread.setResource(resource);
        thread1.setResource(resource);
        thread.start();
        System.out.println(thread.getState());
        synchronized (resource) {
                Thread.sleep(1000);
                System.out.println(thread.getState());
        }
        System.out.println(thread.getState());
        Thread.sleep(500);
        System.out.println(thread.getState());
    }

}


