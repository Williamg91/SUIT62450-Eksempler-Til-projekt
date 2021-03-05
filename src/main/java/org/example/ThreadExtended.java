package org.example;

public class ThreadExtended extends Thread{


    double randomTimer;
    public ThreadExtended(double randomTimer){
        this.randomTimer=randomTimer;
    }

    @Override
    public synchronized void run(){

        try {
         //   long now = timeStart-System.currentTimeMillis();
            Thread.sleep((long) randomTimer);
            System.out.println("thread is running from..."+Thread.currentThread().getName());


        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
