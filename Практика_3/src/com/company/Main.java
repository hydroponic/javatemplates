package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(3);
        System.out.println("0 - List с использованием Lock\n1 - Map с использованием Semaphore");
        if (new Scanner(System.in).nextInt()==1) {
            System.out.println("----------------Map с использованием Semaphore----------------");
            Semaphore sem = new Semaphore(1); // 1 разрешение
            HashMap<Integer, String> map = new HashMap<>();
            map.put(0, "sss");
            map.put(1, "fff");
            map.put(2, "aaa");
            map.put(3, "bbb");
            System.out.println("Карта: ");
            for (Object x : map.values())
                System.out.println(x);
            for (int i = 0; i < 3; i++)
                exec.submit(new CountThread(sem, map));
            exec.shutdown();
        }
        else {
            System.out.println("----------------List с использованием Lock----------------");
            ReentrantLock locker = new ReentrantLock();
            ArrayList<Integer> list = new ArrayList<>();
            list.add(123);
            list.add(456);
            list.add(789);
            list.add(993);
            System.out.println("Список: ");
            for (Object x:list)
                System.out.println(x);
            for (int i = 0; i < 3; i++)
                exec.submit(new CountThread2(locker, list));
            exec.shutdown();
        }
    }
}