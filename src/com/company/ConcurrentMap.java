package com.company;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMap {

    public ConcurrentHashMap<Long, Long> list = new ConcurrentHashMap<>();

    public void Set(Long val)
    {
        this.list.put(val, val);
    }

    public boolean contains(long key){
        return list.containsKey(key);
    }

    public long Get(long count)
    {
        return this.list.get(count);
    }

    public String delByID(long key)
    {
        if(list.containsKey(key))
        {
            list.remove(key);
            return "Del OK";
        }
        return "No key in list";
    }



}
