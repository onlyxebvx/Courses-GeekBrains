package com.company.Classes;

import com.company.Interface.Actions;
import com.company.Interface.Obstacle;

public class RunningTrack implements Obstacle
{
   private int lenght;

    public RunningTrack(int lenght)
    {
        this.lenght = lenght;
    }

    @Override
    public boolean action(Actions actions) {
        if(actions.run(lenght))
        {
            System.out.println(actions.toString()+" пробежал дистанцию");
            return true;
        } else
        {
            System.out.println(actions.toString()+" не смог пробежать дистанцию");
            return false;
        }

    }
}
