package org.example;

public class ThreadImplement implements Runnable{

    @Override
    public void run() {
        System.out.println("Hej fra "+Thread.currentThread().getName());
    }
}
