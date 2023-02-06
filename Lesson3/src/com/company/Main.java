package com.company;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
//        try {
//            int x=10/0;
//        } catch (NullPointerException e)
//        {
//            System.out.println("Exception");
//        }
//        finally
//        {
//            System.out.println("IE");
//        }
//        try {
//            ReportMaker.MakePDFReport("1.txt","IBM/nasfdda");
//        } catch (Exception e) {
//           e.printStackTrace();
//        }
//        int sqrt=0;
//        try
//        {sqrt= sqtr(-6);
//       System.out.println(sqrt);
//        } catch (RuntimeException e)
//        {
//            sqrt=7;
//            e.printStackTrace();
//        }
//        System.out.println(sqrt);
//        System.out.println(doSomething());
//        FileOutputStream out=null;
//        try
//        {
//             out=new FileOutputStream("2.txt");
//            out.close();
//        } catch (IOException e)
//        {
//            e.printStackTrace();
//        }finally
//        {
//            try
//            {
//               if(out!=null) out.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//       throw new MyLibException();
//
//    }
        int[]arr={1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<arr.length;i++){

               try{ if(arr[i]==7 || arr[i]==9)
                {
                    throw new MyLibVectorException(i,arr);
                }
               }catch (MyLibVectorException e)
               {
                  arr[i]=0;
               }
        }
        System.out.println(Arrays.toString(arr));
        int []data={1,2,3,4,5,6};
        int index=8;
       try {
           System.out.println(data[index]);
       }catch (ArrayIndexOutOfBoundsException  | NullPointerException e)
       {
           System.out.println("Error");
       }


    }

    public static int sqtr(int n)
    {
        if(n<0) throw new ArithmeticException("Некорректный вввод");
        return n/2;
    }
    public static int doSomething()
    {
        try
        { return 1;
        } finally {
            return 2;
        }

    }


}
