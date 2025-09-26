package com.pluralsight;

import java.util.Scanner;

public class PayrollCalc {

    public static void main(String[] args) {

        //create the scanner
        Scanner myScanner = new Scanner(System.in);

        //ask the user their name and store it in name
        System.out.print("What is your name: ");
        String name = myScanner.nextLine();

        //ask how many hours worked and store it in hours
        System.out.print("How many hours did you work?: ");
        double hours = myScanner.nextDouble();

        //ask how much they make an hour and store it in pay
        System.out.print("How much do you make? : ");
        double pay = myScanner.nextDouble();

        //print out the values
        System.out.println(name);
        System.out.println(hours);
        System.out.println(pay);

        //calculate pay
        double paycheck = pay * hours;

        //print out pay
        System.out.printf("I made $%.2f", paycheck);




    }

}
