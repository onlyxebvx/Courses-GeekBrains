package com.company.Animal;

public class Dog extends Animal{
    public static int count;

    public Dog(String name,int maxdistanceRun,int maxDistanceSwim) {
        super(name,maxdistanceRun,maxDistanceSwim);
        count++;

    }

  @Override
  public int Run(int distance1)
    {


        if (distance1>=maxDistanceRun)
        {
            System.out.println(name+"(Пёс) не может столько пробежать");
        }
        else  {
            System.out.println(name+" пробежал "+ distance1);
        }

        return distance1;
    }
    @Override
    public int Swim(int distance2)
    {
        if(distance2<=maxDistanceSwim) System.out.println(name+" проплыл "+ distance2);
        else System.out.println(name+" утонул");
        return distance2;
    }

}

