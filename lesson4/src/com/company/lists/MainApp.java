package com.company.lists;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>(Arrays.asList("xzc","dshn","as","A","B","B","C","B","D"));

      System.out.println(arrayList.add("Egor"));
        System.out.println(arrayList.get(3));
       while (arrayList.remove("B"));
        System.out.println(arrayList);

        arrayList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        System.out.println(arrayList);
        List<String> linkedList=new LinkedList<>(Arrays.asList("a","b","c","d"));
        System.out.println(linkedList);
        System.out.println(linkedList.get(2));
        linkedList.remove(2);
        System.out.println(linkedList);

        List<Integer> alist=new ArrayList<>(100000);
        List<Integer> llist=new LinkedList<>();
        for(int i=0;i<1000000;i++)
        {
            int x=(int)(Math.random()*5000);
            alist.add(x);
            llist.add(x);
        }
        long time=System.currentTimeMillis();
       Collections.sort(alist);
        System.out.println("alist "+(System.currentTimeMillis()-time));

         time=System.currentTimeMillis();
        Collections.sort(llist);
        System.out.println("llist "+(System.currentTimeMillis()-time));





    }
}
