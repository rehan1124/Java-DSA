package ConditionalStatements;

import java.util.Scanner;

public class FirstNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter till which number you need sum: ");
        int tillNumber = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= tillNumber; i++) {
            sum = sum + i;
        }
        System.out.printf("Sum of 1st %s natural numbers: %s", tillNumber, sum);
    }
}
