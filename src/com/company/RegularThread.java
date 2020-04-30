package com.company;

import static java.lang.System.*;

public class RegularThread extends  Thread{
    private ConcurrentMap map;
    private int id;
    public RegularThread(String name, int id, ConcurrentMap map) {
        super(name);
        this.id = id;
        this.map = map;
    }
    public void run() {
        long count = this.id;
        out.println("Thread has been started" + id);
        while (true)
        {
            if(map.contains(count))
            {
                out.println("Regular thread " + this.id+ " get " +map.Get(count));
                out.println("Regular thread " + this.id + " sent del task. Return code :" + map.delByID(count));
                count = count + 10;
            }
        try{
                Thread.sleep(5);
            }
            catch(InterruptedException e){
                out.println("Thread has been interrupted");
            }
        }

        }
    }


