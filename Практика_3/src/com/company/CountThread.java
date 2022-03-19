package com.company;

import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class CountThread implements Runnable{
    HashMap map;
    Semaphore sem;
    CountThread(Semaphore sem, HashMap map) {
        this.map=map;
        this.sem=sem;
    }
    public void run() {
        try {
            // System.out.println(Thread.currentThread().getName() + " ожидает разрешение");
            sem.acquire();
            System.out.println("введите ключ удаляемого элемента: ");
            this.map.remove(new Scanner(System.in).nextInt());
            System.out.println("карта после удаления: ");
            for (Object x: map.values())
                System.out.println(x);
        }
        catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        // System.out.println(Thread.currentThread() + " освобождает разрешение");
        sem.release();
    }
}
