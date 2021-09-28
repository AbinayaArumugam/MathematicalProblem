package com.mathematicalproblem;

import java.util.Scanner;

public class PrimeNumberTwisted {
   public static boolean isPrimeNumber(int num){
       for(int i=2;i<num;i++){
           if(num%i==0){
             return false;
           }
       }
       return true;
   }
   public static boolean checkPrimeNumber(int num) {

       int rev = 0;
       if (isPrimeNumber(num)) {
           while (num > 0) {
               int rem = num % 10;
               rev = (rev * 10) + rem;
               num = num / 10;
           }

           if (isPrimeNumber(rev))
               return true;
       }
       return false;
   }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = in.nextInt();
        System.out.println(checkPrimeNumber(number));
    }
}
