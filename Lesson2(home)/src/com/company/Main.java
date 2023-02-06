package com.company;

import com.company.Classes.*;
import com.company.Interface.Actions;
import com.company.Interface.Obstacle;


public class Main {

    public static void main(String[] args) {
//        Cat cat=new Cat("Мурзик",25,179);
//        Cat cat1=new Cat("Мурзатый",40,345);
//        Human human=new Human("Егор",5,505);
//        Human human1=new Human("Крупа",3,100);
//        Robot robot=new Robot("Тэд",50,1000);
//        Robot robot1=new Robot("Альфред",64,1000);
//        cat.jump();
//        robot1.run();
//        human1.jump();
        Actions[] actions=
                {
                      new Cat("Мурзик",25,179),
//                       new Cat("Мурзатый",40,345),
////
//new Human("Крупа",26,255),

                };
        Obstacle[] obstacle=
                {
                        new RunningTrack(250),
                        new Wall(25),
                        new RunningTrack(650)
                };
        for(Actions a:actions)
        {
            for (Obstacle o:obstacle)
            {
                if(!o.action(a)) break; ;
            }
        }












    }
}
