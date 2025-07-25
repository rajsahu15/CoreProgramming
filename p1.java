
import java.util.Scanner;

class p1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\n---Enter The RowsValue : ");
        int n = sc.nextInt();
        System.out.println();
        int s = n;
        for (int i = 1; i <= n * 2 - 1; i++) {
            if (i % 2 == 1) {
                for (int k = 1; k <=s; k++) {
                    System.out.print("  ");
                }
                s--;

                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }

                System.out.println();
            }
        }

    }
}
