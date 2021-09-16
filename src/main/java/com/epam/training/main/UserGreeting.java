package com.epam.training.main;

import java.util.Scanner;

public class UserGreeting {
    public static void main(String[] args) {
        System.out.print("Your name is..");
        Scanner userName = new Scanner(System.in);

        greeting(userName.nextLine());
    }

    public static void greeting(String userName) {
        System.out.println("Hello " + userName);
    }
}