/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numberofdayinmonth;

/**
 *
 * @author khangpt
 */
import java.util.Scanner;

public class NumberOfDayInMonth {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the month: ");
            String monthInput = scanner.nextLine();
            int month = getMonthNumber(monthInput);
            if (month != -1) {
                System.out.print("Enter the year: ");
                int year = scanner.nextInt();
                if (year >= 0) {
                    int days = getDaysInMonth(month, year);
                    if (days != -1) {
                        System.out.println("Number of days in " + monthInput + "/" + year + ": " + days);
                        break;
                    } else {
                        System.out.println("Invalid month happens !");
                    }
                        
                } else {
                    System.out.println("Invalid year ! Press any key to retype !");
                }
            } else {
                System.out.println("Invalid month ! Press any key to retype !");
            }
            scanner.nextLine(); 
        }
    }
    

    private static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        }
        int[] daysInMonth = {31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return daysInMonth[month - 1];
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private static int getMonthNumber(String monthInput) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                           "July", "August", "September", "October", "November", "December"};
        String[] monthAbbreviations = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                                        "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String[] monthAbbreviationsdot = {"Jan.", "Feb.", "Mar.", "Apr.", "May.", "Jun.",
                                        "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec."};

        for (int i = 0; i < months.length; i++) {
            if (monthInput.equals(months[i]) || monthInput.equals(monthAbbreviationsdot[i]) || monthInput.equals(monthAbbreviations[i]) || monthInput.equals(String.valueOf(i + 1))) {
                return i + 1;
            }
        }
        return -1;
    }
}

