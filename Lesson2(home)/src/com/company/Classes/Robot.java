package com.company.Classes;

import com.company.Interface.Actions;


public class Robot implements Actions
{   String name;

    int maxdistanceJump;
    int maxdistanceRun;


    public Robot(String name, int maxdistanceJump, int maxdistanceRun) {
        this.name = name;
        this.maxdistanceJump = maxdistanceJump;
        this.maxdistanceRun = maxdistanceRun;
    }

    @Override
    public boolean jump(int height)
    {
        if (maxdistanceJump>= height) System.out.println(name+"(робот) перепрыгнул стену");
        else System.out.println(name+"(робот) не смог перепрыгнуть");
        return false;
    }


    @Override
    public boolean run(int distance)
    {
        if(maxdistanceRun>= distance) System.out.println(name+"(робот) смог пробежать дистанцию");
        else System.out.println(name+"(робот) не смог пробежать данную дистанцию");
        return false;
    }
    @Override
    public String toString() {
        return  name+"(Робот)";
    }
}
