package com.company;

public class MyLibMatrixException extends MyLibException
{
    private int row;
    private int column;
    private int value;

    public MyLibMatrixException(int row, int column, int [][]array)
    {   super("Invalid data in ["+row+","+column+"]:"+array[row][column]);
        this.row = row;
        this.column = column;
        this.value = array[row][column];
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int getValue() {
        return value;
    }
}
