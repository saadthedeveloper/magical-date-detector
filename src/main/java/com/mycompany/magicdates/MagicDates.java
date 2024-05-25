/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.magicdates;
import java.util.Scanner;
/**
 *
 *  This is a program that asks the user to enter a month (in numeric form), a day, and a two
digit year. The program then determine whether the month times the day is equal 
to the year. If so, it displays a message saying the date is magical. Otherwise, it
displays a message saying the date is not magical.
 */
public class MagicDates {

    public static void main(String[] args) {
        int day;
        int month;
        int year;
        int dayTimesMonth;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("This program checks if a given date is 'magic.' A date is considered magic if the month multiplied by \n"
                + "the day equals the last two digits of the year. Please enter the month (numeric form), day, and a two-digit year \n"
                + "to see if your date is magic!");
        

        //Asking for month from user and validating input below
        System.out.println("Enter a month number (1-12)");
        month = keyboard.nextInt();
        
        while(month < 1 && month > 12)
        {
            System.out.println("Enter a number within 1-12");
        }
        //Asking for month from user and validating input above
        
        //Asking for any day of the monhth from user and validating input below
        System.out.println("Enter any day(1-31)");
        day = keyboard.nextInt();
        
        while(day < 1 && day > 30)
        {
            System.out.println("Enter a number within 1-30");
        }
        //Asking for any day of the monhth from user and validating input above
        
        
        //Asking for a two digit year from user and validating input below
        System.out.println("Enter a two digit year(00-99)");
        year = keyboard.nextInt();
        
        while(year < 0 && year > 99)
        {
            System.out.println("Enter a number within 00-99");
        }
        //Asking for a two digit year from user and validating input above
        
        dayTimesMonth = day * month;
        
        //  checking below if the date is magical 
        if(dayTimesMonth == year)
        {
            System.out.println("the date is magical");
        }
        else
        {
            System.out.println("the date is not magic");
        }
        //  checking below if the date is magical
        
    }
}
