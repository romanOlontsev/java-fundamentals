package com.epam.training.main.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount of random numbers: ");
        int amountNumbers = scanner.nextInt();

        RandomNumber createArrayNumbers = new RandomNumber(amountNumbers);
        printlnArray(createArrayNumbers);

        createArrayNumbers.setArrayRandomNumbers(amountNumbers);
        printArray(createArrayNumbers);
    }

    public static void printlnArray(RandomNumber createArrayNumbers) {
        for (int number : createArrayNumbers.getArrayRandomNumbers()) {
            System.out.println(number);
        }
    }

    public static void printArray(RandomNumber createArrayNumbers) {
        for (int number : createArrayNumbers.getArrayRandomNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
