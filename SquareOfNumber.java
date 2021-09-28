package com.mathematicalproblem;

import java.util.Scanner;

public class SquareOfNumber {
    public static int findSquareRoot(int num){
        if(num==0||num==1){
            return num;
        }
        int i=0;
        int result=0;
        while (result<=num){
            i++;
            result=i*i;
        }
        return i-1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = in.nextInt();
        System.out.println(findSquareRoot(number));
    }
}
