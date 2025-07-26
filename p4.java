import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value for n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        
        for (int i = n-1; i >=1; i--) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        scanner.close();
    }
}
