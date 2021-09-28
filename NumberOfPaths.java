package com.mathematicalproblem;

import java.util.Scanner;

public class NumberOfPaths {
    public static int numberOfPath(int row,int col){
        if(row==1||col==1){
            return 1;
        }
        return numberOfPath(row-1,col)+numberOfPath(row,col-1);
    }
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the numbers of row");
        int row=in.nextInt();
        System.out.println("Enter the numbers of column");
        int column=in.nextInt();
        System.out.println(numberOfPath(row,column));
    }
}
