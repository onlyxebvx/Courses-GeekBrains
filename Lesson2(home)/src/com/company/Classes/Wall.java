package com.company.Classes;

import com.company.Interface.Actions;
import com.company.Interface.Obstacle;

public class Wall implements Obstacle
{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean action(Actions actions)
    {
        if(actions.jump(height))
        {
            System.out.println(actions.toString()+" перепрыгнул стену");
            return true;
        }
        else
        {
            System.out.println(actions.toString()+" не смог перепрыгнуть стену");
            return false;
        }
    }
}
