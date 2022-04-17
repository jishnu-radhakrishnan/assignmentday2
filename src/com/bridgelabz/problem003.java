package com.bridgelabz;
import java.util.Scanner;
//If Else Statement Problems
//1. Read a single Digit Number and write in word

public class problem003 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a single digit number: ");
        int num = input.nextInt();
        if(num==0)
        {
            System.out.println("Entered Number in words is ZERO");
        } else if (num==1) {
            System.out.println("Entered Number in words is ONE");
        } else if (num==2) {
            System.out.println("Entered Number in words is TWO");
        } else if (num==3) {
            System.out.println("Entered Number in words is THREE");
        } else if (num==4) {
            System.out.println("Entered Number in words is FOUR");
        } else if (num==5) {
            System.out.println("Entered Number in words is FIVE");
        } else if (num==6) {
            System.out.println("Entered Number in words is SIX");
        } else if (num==7) {
            System.out.println("Entered Number in words is SEVEN");
        } else if (num==8) {
            System.out.println("Entered Number in words is EIGHT");
        } else if (num==9) {
            System.out.println("Entered Number in words is NINE");
        }
        else {
            System.out.println("Error : Invalid Number");
    }

    }
    }
