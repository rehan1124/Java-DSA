package Patterns;

public class ReverseHalfPyramid {
    public static void main(String[] args) {
        int m = 4;
        for (int i = m; i >= 1; i--) {
            System.out.println("*".repeat(i));
        }
    }
}
