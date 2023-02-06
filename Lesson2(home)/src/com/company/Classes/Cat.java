package com.company.Classes;

import com.company.Interface.Actions;


public class Cat implements Actions
{

    String name;
    int maxdistanceJump;
    int maxdistanceRun;

    public Cat(String name, int maxdistanceJump, int maxdistanceRun) {
        this.name = name;
        this.maxdistanceJump = maxdistanceJump;
        this.maxdistanceRun = maxdistanceRun;
    }

    @Override
    public boolean jump(int height)
    {
        if (maxdistanceJump>=height) System.out.println(name+"(Кот) преодолел препятствие");
        else
        {
            System.out.println(name+"(Кот) не смог перепрыгнуть");
            return  false;
        }

       return true;
    }


    @Override
    public boolean run(int distance )
    {
        if(maxdistanceRun>= distance) System.out.println(name+"(Кот) смог пробежать дистанцию");
        else System.out.println(name+"(Кот) не смог пробежать данную дистанцию");
        return false;
    }

    @Override
    public String toString() {
        return  name+"(Кот)";
    }
}
