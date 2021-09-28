package com.mathematicalproblem;

import java.util.Scanner;

public class PerfectNumber {
    public static boolean isPerfectNumber(int num){
       int sum=0;
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = in.nextInt();
        System.out.println(isPerfectNumber(number));
    }
}
