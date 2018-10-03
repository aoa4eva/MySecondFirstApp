package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

//Defining variables
        int num1;
        int num2;
        int total;
//       Setting up application for input
        Scanner keyboard = new Scanner(System.in);

//       Prompting user for first number
        System.out.println("Enter a number 1");

//        Storing first number
        num1 = keyboard.nextInt();

//        Prompting for second number
        System.out.println("Enter number 2");

//        Storing second number
        num2 = keyboard.nextInt();

//        Summing numbers
        total=num1+num2;

//        Printing total
        System.out.println(total);





    }
}
