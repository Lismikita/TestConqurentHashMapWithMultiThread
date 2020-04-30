package com.company;

import static java.lang.System.*;

public class RegularThread extends  Thread{
    private ConcurrentMap map;
    private int id;
    public RegularThread(int id, ConcurrentMap map) {
        this.id = id;
        this.map = map;
    }
    public void run() {
        out.println("Thread has been started" + id);
        while (true)
        {
            out.println(map.Get(id));

        try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                out.println("Thread has been interrupted");
            }
        }

        }
    }


