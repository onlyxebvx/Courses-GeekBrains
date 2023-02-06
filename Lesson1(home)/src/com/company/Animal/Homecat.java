package com.company.Animal;

public class Homecat extends Animal{
    public static int count;
    public Homecat(String name,int maxdistanceRun,int maxDistanceSwim) {
        super(name,maxdistanceRun,maxDistanceSwim);
        count++;
    }

    @Override
    public int Run(int distance1) {
        if(distance1<=maxDistanceRun) System.out.println(name+" пробежал "+distance1);
        else System.out.println(name+" не может столько пробежать!");
        return distance1;
    }

    @Override
    public int Swim(int distance2) {
        System.out.println(name+"(Кот) не умеет плавать!!!");
        return 0;
    }
}
