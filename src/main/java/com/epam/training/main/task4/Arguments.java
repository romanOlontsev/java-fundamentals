package com.epam.training.main.task4;

public class Arguments {
    public static void main(String[] args) {
        System.out.println(sumOfArguments(args));
        System.out.println(multiplicationOfArguments(args));
    }

    public static int sumOfArguments(String[] args) {
        int sum = 0;
        for (String arg : args) {
            int number = Integer.parseInt(arg);
            sum += number;
        }
        return sum;
    }

    public static int multiplicationOfArguments(String[] args) {
        int multi = 1;
        for (String arg : args) {
            int number = Integer.parseInt(arg);
            multi *= number;
        }
        return multi;
    }
}
