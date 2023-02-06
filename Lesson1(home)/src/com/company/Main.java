package com.company;

import com.company.Animal.Animal;
import com.company.Animal.Dog;
import com.company.Animal.Homecat;
import com.company.Animal.Tiger;

import java.util.Calendar;


public class Main {

    public static void main(String[] args)
    {

//        Animal cat = new Homecat("Murzik");
//        Animal tiger = new Tiger("Chuka");
//        dog.Run(450);
//        dog.Swim(4);
//        cat.Run(100);
//        cat.Swim(25);
//        tiger.Run(1000);
//        tiger.Swim(246);

//        int[] array = new int[]{dog.Run(450), cat.Run(100), tiger.Run(1000)};
//        for (int i = 0; i < array.length; i++);
        Animal[] animals =
                {
                        new Dog("Bobik",500,10),
                        new Dog("Bocman",500,15),
                        new Homecat("Murzik",200,0),
                        new Homecat("Demiklion",220,0),
                        new Tiger("Chuka",1000,980),
                        new Tiger("Chupapi",1500,1000),
                        new Homecat("Munyanyo",185,0)

                };

        for(Animal allanimal:animals)
        {
            allanimal.Run(300);

        }

        System.out.println("---     ---     ---");
        for(Animal allanimal:animals)
        {
            allanimal.Swim(100);

        }
        System.out.println("---     ---     ---");

        System.out.println("Всего животных: "+Animal.count);
        System.out.println("Всего псов: "+Dog.count);
        System.out.println("Всего домашних котов: "+Homecat.count);
        System.out.println("Всего тигров: "+Tiger.count);
        System.out.println("---     ---     ---");
        Animal dogMops = new Dog("Мопс",0,0);
        System.out.println("Всего животных: "+Animal.count);




    }
}
