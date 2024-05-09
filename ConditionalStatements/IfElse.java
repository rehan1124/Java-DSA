package ConditionalStatements;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();

//        Check if person is adult or not
        if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not an adult");
        }

//        Odd or Even
        if (age % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

//        Which is greater number?
        System.out.println("Enter 2 numbers:");
        int firstNb = sc.nextInt();
        int secondNb = sc.nextInt();

        if (firstNb > secondNb) {
            System.out.println("First number is greater");
        } else if (firstNb < secondNb) {
            System.out.println("Second number is greater");
        } else {
            System.out.println("Both are equal");
        }
    }
}
