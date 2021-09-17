package com.epam.training.main.task5;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        searchMonths();
    }

    public static void searchMonths() {
        switch (inputNumber()) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }
    }

    public static int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        int inputNumber;
        do {
            System.out.print("Enter a number from 1 to 12: ");
            inputNumber = scanner.nextInt();
        } while (inputNumber > 12 || inputNumber < 1);
        return inputNumber;
    }
}