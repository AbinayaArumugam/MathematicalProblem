package com.mathematicalproblem;

import java.util.Scanner;

public class CheckNumberIsBalancedOrNot {
    public static boolean checkBalance(int num) {
        int[] arr = new int[100];
        int k = 0;
        int lSum=0;
        int rSum=0;
        while (num > 0) {
            arr[k++] = num % 10;
            num = num / 10;
        }
        for (int i = 0; i < k/2; i++) {
            lSum+=arr[i];
        }
        for (int i = k/2+1; i < k; i++) {
            rSum+=arr[i];
        }
        if(lSum==rSum)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = in.nextInt();
        System.out.println(checkBalance(number));
    }
}
/*

    Boolean balancedNumber(String num)
    {
        int len=num.length();
        int lSum=0;
        int rSum=0;
        for(int i=0;i<len;i++){
            if(i<len/2){
                lSum+=num.charAt(i)-48;
            }
            else if(i>len/2){
                rSum+=num.charAt(i)-48;
            }
        }
        if(lSum==rSum)
            return true;
        return false;
    }

 */