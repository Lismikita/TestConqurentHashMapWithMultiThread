package com.company;

import java.util.ArrayList;

public class ProcessThread extends Thread{
    public ConcurrentMap map;
    public ThreadList list;

    public ProcessThread(String name, ConcurrentMap map, ThreadList list) {
        super(name);
        this.list = list;
        this.map = map;
    }


    public void run() {
        for(long count = 0; count < 100000; count++)
        {
           this.map.Set(count);
           System.out.println("Process Thread set " + count +" in map");
            try
            {
                Thread.sleep(1);
            }
            catch(InterruptedException e){
                System.out.println("Thread has been interrupted");
            }
        }
    }

    
}
