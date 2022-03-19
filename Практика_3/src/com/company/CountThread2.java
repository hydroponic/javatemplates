package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class CountThread2 implements Runnable {
    ArrayList list;
    ReentrantLock locker;
    CountThread2(ReentrantLock locker, ArrayList list) {
        this.list=list;
        this.locker=locker;
    }
    public void run() {
            locker.lock();
            System.out.println("введите индекс удаляемого узла: ");
            this.list.remove(new Scanner(System.in).nextInt());
            System.out.println("список после удаления: ");
            for (Object x: list)
                System.out.println(x);
        locker.unlock();
    }
}
