package com.company;

import com.company.Fruits.Fruit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box <T extends Fruit>
{
    private List<T> list;

    public Box(T...obj) {
        list= Arrays.asList(obj);
    }

    public Box() {
       list=new ArrayList<T>();
    }

    void add(T obj)
    {
        list.add(obj);
    }
    void info()
    {
        if(list.isEmpty())
        {
            System.out.println("Коробка пуста");
        } else
        {
            System.out.println("В коробке находятся: "+list.get(0).toString()+"(в количестве:"+list.size()+" штук)");
        }


    }
    float getWeight()
    {
        if(list.isEmpty()){ return 0;}
        else { return list.size()*list.get(0).getWeight();}
    }
    boolean compare(Box<?>box)
    {
        return this.getWeight()==box.getWeight();
    }
    void empty(Box<T>box)
    {
        box.list.addAll(list);
        list.clear();

    }
}
