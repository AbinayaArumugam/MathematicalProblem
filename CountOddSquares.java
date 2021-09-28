package com.mathematicalproblem;

import java.util.Scanner;

public class CountOddSquares {
    public static int countOddFactors(int start,int end){
        return (int)Math.pow((double) end,0.5)-(int)Math.pow((double)start-1,0.5);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the starting number");
        int start = in.nextInt();
        System.out.println("Enter the ending number");
        int end = in.nextInt();
        System.out.println(countOddFactors(start,end));
    }
}
