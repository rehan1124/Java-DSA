package Patterns;

public class RotatedHalfPyramid {
    public static void main(String[] args) {
        int m = 4;
        for (int i = 1; i <= m; i++) {
            // To print spaces
            for (int j = 1; j <= m - i; j++) {
                System.out.print(" ");
            }
            // Print *
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
