package com.company;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMap {

    public ConcurrentHashMap<Long, Long> list = new ConcurrentHashMap<>();

    public void Set(Long val)
    {
        this.list.put(val, val);
    }

    public long Get(long count)
    {
        if (this.list.containsKey(count)){
        return this.list.get(count);}
        return 0;
    }



}
