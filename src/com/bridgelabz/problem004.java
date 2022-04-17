package com.bridgelabz;
import java.util.Scanner;

//Programs With While Loop
// 1. Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5

public class problem004 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to get sum=");
        int num= scanner.nextInt();//number taken from user
        int sum=0;
        int i=1;
        while(i<=num)
        {
            sum = sum + i ;
            i++;
        }
        System.out.println("Sum=" + sum);

    }

}
