package com.company;

import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
	// write your code her
        ThreadList list = new ThreadList();
        System.out.println("ArrayList created");
    ConcurrentMap map = new ConcurrentMap();
        System.out.println("ConcurrentMap created");
    ProcessThread process = new ProcessThread("ProcessThread",map, list);
        System.out.println("ProcessThread created");

        for(Integer count = 1; count <= 10; count++)
        {
            RegularThread regThread = new RegularThread(count.toString(),count, map);
            System.out.println("Thread " + count +" created");
            regThread.start();
            list.Set(regThread);
        }
        process.start();
    }
}
