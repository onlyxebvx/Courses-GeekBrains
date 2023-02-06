package com.company.generics;

import com.company.generics.BoxWithNumbers;
import com.company.generics.GenBox;

import java.util.List;

public class Main {

    public static void main(String[] args) {
//       SimpleBox intBox1=new SimpleBox(10);
//       SimpleBox intBox2=new SimpleBox(24);
//
//       int sum=(Integer)intBox1.getObj()+(Integer)intBox2.getObj();
//        System.out.println(sum);
        GenBox<String> stringBox=new GenBox<>("Java");
        GenBox<Integer> intBox1=new GenBox<>(10);
        GenBox<Integer> intBox2=new GenBox<>(20);
          intBox2.setObj(30);
        int sum=intBox1.getObj()+intBox2.getObj();
        System.out.println(sum);
        BoxWithNumbers<Integer> intBox=new BoxWithNumbers<>(1,2,3,4,5,6);
        BoxWithNumbers<Integer> intBox3=new BoxWithNumbers<>(1,2,3,4,5,6);
        System.out.println(intBox.average());
        BoxWithNumbers<Float> floatBox=new BoxWithNumbers<>(1.0f,2.0f,3.0f,4.0f,5.0f,6.0f);
        System.out.println(floatBox.average());
        System.out.println(intBox.compareaverage(floatBox));
        System.out.println(intBox.getClass().getName());
        GenBox<Number> gbn=new GenBox<>(10);
        GenBox<Integer>gbi=new GenBox<>(10);
        doSomething1(gbn);
        doSomething2(gbn);
//        doSomething1(gbi);
//         doSomething2(gbi);




    }
    public static void doSomething1(GenBox<? extends Number> box)
    {

    }
    public static void doSomething2(GenBox<Number> box)
    {

    }
    public static void doSomething3(GenBox<? super Number> box)
    {

    }
    public static <T>T getFirstElement(List<T> list)
    {
        return list.get(0);
    }


}
