package ConditionalStatements;

import java.util.Scanner;

public class SwitchCaseStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number from 1 to 3:");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
