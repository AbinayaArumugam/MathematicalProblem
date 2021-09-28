package com.mathematicalproblem;

import java.util.Scanner;

public class LuckyNumber {
    static int counter=2;
    public static boolean isLucky(int num){
        if(counter>num)
            return true;
        if(num%counter==0)
            return false;
        int nextPos=num-(num/counter);
        counter++;
        return isLucky(nextPos);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = in.nextInt();
        System.out.println(isLucky(number));
    }
}
