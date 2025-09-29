package com.pluralsight;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {

        //create the scanner so we can use it to capture
        //user input
        Scanner myScanner = new Scanner(System.in);

        //present the user with the first question
        //Enter the first number:
        System.out.print("Enter the first number: ");

        //capture the users response
        int firstNum = myScanner.nextInt();

        //present the user with the second question
        //Enter the second number:
        System.out.print("Enter the second number: ");

        //capture the users response
        int secondNumber = myScanner.nextInt();

        //eat the newline/enter key press
        myScanner.nextLine();

        //HERE IS WHERE THE MENU WOULD GO
        /*
        Possible calculations:
            (A)dd
            (S)ubtract
            (M)ultiply
            (D)ivide
         Please select an option: M
         */
        System.out.println("Possible Calculations:");
        System.out.println("\t(A)dd");
        System.out.println("\t(S)ubtract");
        System.out.println("\t(M)ultiply");
        System.out.println("\t(D)ivide");
        System.out.print("Please select an option: ");

        //store what action they chose from the menu
        String action = myScanner.nextLine();

        //create some variables to store our results and our operator for the action chosen
        int result = 0;
        String operator = "";
        //using some control flow login (if statements)
        //to do something different based on the users menu choice

        //if the action is "a" they chose to add
        if( action.equalsIgnoreCase("a") ){

            result = firstNum + secondNumber;
            operator = "+";

        }

        if( action.equalsIgnoreCase("S") ){
            result = firstNum - secondNumber;
            operator = "-";
        }

        if( action.equalsIgnoreCase("M") ){
            result = firstNum * secondNumber;
            operator = "*";
        }

        if( action.equalsIgnoreCase("d") ){
            System.out.println("The User Chose Divide");
        }


        //do the math (in this case we will always multiply
        //int result = firstNum * secondNumber;

        //print the result
        //this is with string concatenation
        System.out.println(firstNum + " " + operator + " " + secondNumber + " = " + result);

        //using formatted string with printf
        System.out.printf("%d %s %d = %d", firstNum, operator, secondNumber, result);

    }
}
