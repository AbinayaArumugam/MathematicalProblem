package com.mathematicalproblem;

import java.util.Scanner;

public class PalindromicNumber {
    public static long reverseBits(long num){
        long rev=0;
        while (num>0){
            rev<<=1;
            if ((num&1)==1){
                rev^=1;
            }
            num>>=1;
        }
        return rev;
    }
    public static boolean isPalindrome(long num){
        long rev=reverseBits(num);
        return (num==rev);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = in.nextInt();
        System.out.println(isPalindrome(number));
    }
}
