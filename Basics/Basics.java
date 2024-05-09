package Basics;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        System.out.println("First program");

        /*
        Pattern printing
         */
        for (int i = 1; i < 6; i++) {
            System.out.println("*".repeat(i));
        }

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.printf("Name: %s%n", name);
    }
}
