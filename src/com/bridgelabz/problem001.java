package com.bridgelabz;
import java.util.Scanner;


//1. Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5

public class problem001 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to get sum=");
        int num= scanner.nextInt();//number taken from user
        int sum=0;
        for(int i=1;i<=num;i++)
        {
            sum = sum + i ;
        }
        System.out.println("Sum=" + sum);

    }

}
