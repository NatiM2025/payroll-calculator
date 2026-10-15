package com.pluralsight;

import java.util.Scanner;

public class payrollCalcuator {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);

        System.out.print("Hi! what is your name? ");
        String name = myscanner.next();

        System.out.print(name + " Please Enter your worke hours: ");
        double workHour = myscanner.nextDouble();

        System.out.print(name + " What is your PayRate: ");
        double payRate = myscanner.nextDouble();

        double grossPay= workHour * payRate;

        System.out.println("Thank you! " + name);

        System.out.println(name + " You Work for: " + workHour + " With the PayRate of: " + payRate + " Your Gross Pay will be: " + grossPay);


    }
}
