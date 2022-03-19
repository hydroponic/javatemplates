package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example implements Runnable{
    Example(int c) {
        ExecutorService exec = Executors.newFixedThreadPool(c);
        for (int i=0;i<c;i++)
            exec.submit(this::run);
            exec.shutdown();
    }
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
