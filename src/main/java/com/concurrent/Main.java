package com.concurrent;

import com.concurrent.concurrentclasses.MyThread;



public class Main {

    private static int threadsNumber = 4;

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Создаю потоки...");
        ThreadGroup mainThreadGroup = new ThreadGroup("main group");

        int count = 0;
        while(count < Main.threadsNumber){

            count++;
            new MyThread(mainThreadGroup,"Я поток " + count).start();
        }


        Thread.sleep(10000);

        System.out.println("Завершаю все потоки.");
        mainThreadGroup.interrupt();

    }
}