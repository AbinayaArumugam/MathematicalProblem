package com.mathematicalproblem;

import java.util.Scanner;

public class PowerOfNumber {
    public static boolean checkPower(int num,int key){
        for(int i=0;i<key/2;i++){
            if(Math.pow(num,i)==key){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = in.nextInt();
        System.out.println("Enter the key");
        int key=in.nextInt();
        System.out.println(checkPower(number,key));
    }
}
