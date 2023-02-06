package com.company;

public class MyLibVectorException extends MyLibException
{
    private int index;
    private int value;

    public MyLibVectorException(int index, int []array) {
        super("Invalid data in ["+index+"]:"+array[index]);
        this.index = index;
        this.value = array[index];
    }
}
