package com.bridgelabz;
import java.util.Scanner;
//If Else Statement Problems
//2. Read a Number 1,10,100,1000 and display unit, ten hundred

public class problem002 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int th = 0;
        int hun = 0;
        int tens = 0;
        int ones = 0;
        System.out.print("Enter 4 digit number: ");
        int num = input.nextInt();
        if (num <= 9999 && num > 999)
        {
            th =  num/1000;
            System.out.printf("thousands place digit: " + th  );
            hun = (num/100)%10;
            System.out.printf("\nHundreds place digit: " + hun);
            tens = (num/10)%10;  // compare with your code
            System.out.printf("\nTens place digit: " + tens);
            ones = (num%10);   // compare with your code
            System.out.printf("\nOnes place digit: " + ones);
        }
        else
        {
            if (num > 9999)
                System.out.println("\nError! Number more then  digits.");
            if (num < 1000)
                System.out.println("Error! Number less then 4 digits.");
        }
    }
}

