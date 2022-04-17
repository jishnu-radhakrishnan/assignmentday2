package com.bridgelabz;
import java.util.Scanner;

//Programs With For Loop
//3. Write a Program to find Palindrome Number
public class problem005 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number =");
        int num = scanner.nextInt();//number taken from user
        int rev;
        int rem;
        int x;
        x = num;
        for (rev = 0; num>0; num /= 10) {
            rem = num % 10;
            rev = (rev * 10) + rem;
        }
        if (rev == x) {
            System.out.println("Given number is a palindrome number");
        } else {
            System.out.println("Given number is not a palindrome number");
        }
    }
}
