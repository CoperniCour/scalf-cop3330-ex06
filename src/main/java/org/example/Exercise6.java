/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Courtney Scalf-Crickenberger
 */

//Exercise 6 - Retirement calculator

package org.example;
import java.text.MessageFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        //Get current year
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);

        //Get current age & year of retirement desired from user
        Scanner getAge = new Scanner(System.in);
        System.out.print("What is your current age? ");
        String age = getAge.nextLine();
        int i=Integer.parseInt(age);

        Scanner getRetire = new Scanner(System.in);
        System.out.print("At what age would you like to retire? ");
        String retire = getRetire.nextLine();
        int j=Integer.parseInt(retire);

        int a = j - i;
        int b = year + a;
        //Print out  how long until they can retire
        String yrsLeft = MessageFormat.format("You have {0} years left until you can retire.", a);
        System.out.println(yrsLeft);
        String message = String.format("It's %d, so you can retire in %d.",year ,b);
        System.out.println(message);

    }
}
