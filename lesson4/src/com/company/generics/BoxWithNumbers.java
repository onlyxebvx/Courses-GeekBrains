package com.company.generics;

public class BoxWithNumbers <N extends Number>{
    private N[] array;

    public BoxWithNumbers(N... array) {
        this.array = array;
    }
    public double average()
    {   double avg=0.0;
        for(int i=0;i<array.length;i++)
        {
            avg+=array[i].doubleValue();
        }
        return avg/array.length;
    }
    public boolean compareaverage(BoxWithNumbers<?> another)
    {
        return Math.abs(this.average()-another.average())<0000.1;
    }
}
