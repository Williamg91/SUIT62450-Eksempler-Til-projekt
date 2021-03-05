package org.example;

public class ThreadStarter {

    public static void main(String[] args) {

        ThreadExtended randomtimer = new ThreadExtended(Math.random()*1000);
        randomtimer.start();
        ThreadExtended randomtimer2 = new ThreadExtended(Math.random()*1000);
        randomtimer2.start();


/*
        ThreadExtended threadExtended = new ThreadExtended();
//
        ThreadImplement threadImplement = new ThreadImplement();



     Thread implemented = new Thread(threadImplement);
        implemented.start();



        threadExtended.start();
*/

        //lav 4-5 traade, der starter tilfældigt



        //her vil jeg gerne finde ud af, om random er forskelligt.
    }
}


