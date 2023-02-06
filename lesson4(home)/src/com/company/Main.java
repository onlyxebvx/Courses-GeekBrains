package com.company;


import com.company.Fruits.Apple;
import com.company.Fruits.Orange;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Integer[]arr={1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        System.out.println("1-ое задание:");
        swapElements(arr,5,4);
        System.out.println(Arrays.toString(arr));
        System.out.println("2-ое задание:");
        List<Integer> list=convertoList(arr);
        System.out.println(arr.getClass()+":"+Arrays.toString(arr));
        System.out.println(list.getClass()+":"+list);
        System.out.println("3-е задание:");
        Orange orange=new Orange();
        Apple apple=new Apple();
        Box<Orange> box1=new Box<>();
        Box<Apple> box2=new Box<>();
        Box<Apple> box3=new Box<>();
        box1.add(new Orange());
        box1.add(new Orange());
        box1.add(new Orange());
        box1.add(new Orange());
        for(int i=0;i<6;i++)
        {
            box2.add(new Apple());
        }
        for(int i=0;i<4;i++)
        {
            box3.add(new Apple());
        }
        box1.info();
        box2.info();
        box3.info();
        System.out.println("Вес коробки box1: "+box1.getWeight());
        System.out.println("Вес коробки box2: "+box2.getWeight());
        System.out.println("Вес коробки box3: "+box3.getWeight());
        System.out.println("Сравниваем вес коробки box1 c box2: "+box1.compare(box2));
        System.out.println("Сравниваем вес коробки box3 c box2: "+box3.compare(box2));
        box2.info();
        box3.info();
        box2.empty(box3);
        box2.info();
        box3.info();









    }
    public static <T> void swapElements(T[] array,int index1,int index2)
    {
        T temp;
        temp=array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }
    public static <E> List<E> convertoList(E[]array)
    {
        return Arrays.asList(array);
    }
}
