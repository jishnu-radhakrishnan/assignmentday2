package com.bridgelabz;
import java.util.Scanner;

//Programs With For Loop
//Write a Program to reverse the integer number eg. Input n=231 reverse is 132

public class problem006 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number =");
        int num = scanner.nextInt();//number taken from user
        int rev;
        for (rev=0; num > 0; num /= 10)
        {
            int x = num % 10;
            rev = (rev * 10) + x;
        }
        System.out.println(rev);
    }
}
