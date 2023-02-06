package com.company.Classes;

import com.company.Interface.Actions;


public class Human implements Actions
{   String name;

    int maxdistanceJump;
    int maxdistanceRun;

    public Human(String name, int maxdistanceJump, int maxdistanceRun) {
        this.name = name;
        this.maxdistanceJump = maxdistanceJump;
        this.maxdistanceRun = maxdistanceRun;
    }

    @Override
    public boolean jump(int height)
    {
        if (maxdistanceJump>= height) System.out.println(name+"(человек) перепрыгнул стену");
        else System.out.println(name+"(человек) не смог перепрыгнуть");
        return false;
    }


    @Override
    public boolean run(int distance)
    {
        if(maxdistanceRun>= distance) System.out.println(name+"(человек) пробежал данную дистанцию");
        else System.out.println(name+"(человек) не смог пройти данную дистацию");
        return false;
    }
    @Override
    public String toString() {
        return  name+"(Человек)";
    }
}
