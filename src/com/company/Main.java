package com.company;

import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
	// write your code her
        ThreadList list = new ThreadList();
        System.out.println("ArrayList created");
    ConcurrentMap map = new ConcurrentMap();
        System.out.println("ConcurrentMap created");
    ProcessThread process = new ProcessThread(map, list);
        System.out.println("ProcessThread created");
        process.run();
        for(int count = 0; count < 10; count++)
        {
            RegularThread regThread = new RegularThread(count, map);
            System.out.println("Thread " + count +" created");
            regThread.run();
            list.Set(regThread);

        }
//        for (RegularThread regThread: list.GetIterator() )
//        {
//            regThread.run();
//        }




    }
}
