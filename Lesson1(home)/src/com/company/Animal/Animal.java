package com.company.Animal;

public abstract class Animal {
public static int  count;
    String name;
    int distance1;
    int distance2;
    int maxDistanceRun;
    int maxDistanceSwim;


    public Animal(String name,int maxdistanceRun,int maxDistanceSwim) {
        this.name = name;
        this.maxDistanceRun=maxdistanceRun;
        this.maxDistanceSwim=maxDistanceSwim;
        count++;

    }
    public void info()
    {
        System.out.println(name);
    }
    public abstract int Run(int distance1);
 public abstract int Swim(int distance2);
}
