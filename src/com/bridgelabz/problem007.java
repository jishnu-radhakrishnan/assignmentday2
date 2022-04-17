package com.bridgelabz;
import java.util.Scanner;
//Programs with Switch Statement
//1. Write a Program to Check Vowel or Consonant
public class problem007 {
    public static void main(String [] args){
        boolean vowel=false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Alphabet=");
        char v=scanner.next().charAt(0);
        scanner.close();
        switch (v){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':    
                vowel = true;
        }
        if(vowel==true){
            System.out.println("The given alphabet is a Vowel");
        }
        else if ((v>='a'&& v<='z')||(v>='A'&& v<='Z'))
        {
            System.out.println("The given alphabet is a Consonent");
            
        }
        else {
            System.out.println("The given input is not an alphabet");

    }
    }
}
