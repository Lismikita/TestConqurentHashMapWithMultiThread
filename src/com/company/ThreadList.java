package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class ThreadList {
    private ArrayList<RegularThread> list = new ArrayList<>();

    public void Set(RegularThread thread)
    {
        this.list.add(thread);
    }

    public ArrayList<RegularThread> GetIterator()
    {
        return this.list;
    }
}
