import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value for n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("__");
            }

            for (int j = 1; j <= i; j++) {
                if(j==1||i==n)System.out.print("*-");
                else System.out.print("  ");
            }

            for (int j = 1; j < i; j++) {
              if(i==n||j==i-1)  System.out.print("*-");
              else System.out.print("  ");
            }

            System.out.println();
        }

        scanner.close();
    }
}
