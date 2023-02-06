package com.company.Animal;

public class Tiger extends Animal{
    public static int count;
    public Tiger(String name,int maxdistanceRun,int maxDistanceSwim) {
        super(name,maxdistanceRun,maxDistanceSwim);
        count++;
    }

    @Override
    public int Run(int distance1)
    {
        if(distance1<=maxDistanceRun) System.out.println(name+" пробежал "+distance1);
        else System.out.println(name+"(Тигр) устал и не смог больше пробежать");
        return distance1;
    }
    @Override
    public int Swim(int distance2)
    {
        if(distance2<=maxDistanceSwim) System.out.println(name+" проплыл "+distance2);
        else System.out.println(name+"(Тигр) утонул");
        return distance2;
    }
}
