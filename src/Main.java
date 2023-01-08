import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Stores the entered number.
        int n1, n2, n3;

        // Scans the entered numbers.
        Scanner scanner = new Scanner(System.in);

        // Stores the entered numbers.
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        n3 = scanner.nextInt();

        // Checks if entered numbers are in increasing order.
        if (n1 < n2 && n2 < n3) {
            System.out.println("The numbers entered are in increasing order");
        }

        // Checks if entered numbers are in decreasing order.
        else if (n1 > n2 && n2 > n3) {
            System.out.println("The numbers entered are in decreasing order");
        } else {
            System.out.println("The numbers are neither in increasing order nor in decreasing order");
        }
    }
}