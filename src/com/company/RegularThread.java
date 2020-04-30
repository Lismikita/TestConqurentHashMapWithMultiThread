package com.company;

public class RegularThread extends  Thread{
    private ConcurrentMap map;
    private int id;
    public RegularThread(int id, ConcurrentMap map) {
        this.id = id;
        this.map = map;
    }
    public void Run() {
        while (true)
        {

                map.Get(id);
                System.out.println("Regular Thread " + this.id+" get in map");
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                System.out.println("Thread has been interrupted");
            }
        }
    }

}
