package com.mathematicalproblem;

import java.util.Scanner;

public class NumberOfOpenDoors {
   public static int findOpenDoors(long num){
       return (int)Math.sqrt(num);
   }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        long number = in.nextInt();
        System.out.println(findOpenDoors(number));
    }
}
/*
 public static boolean oddFactors(int num){
        double i=Math.sqrt(num);
        if((i*i)==num)
            return true;
        return false;
    }
    public static int findOpenDoors(int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if(oddFactors(i)){
                count++;
            }
        }
        return count;
    }
 */