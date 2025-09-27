public class ArrayAddition {
    public static void main(String[] args) {
        int a[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int b[][] = {
                { 2, 1, 3 },
                { 3, 4, 7 },
                { 1, 0, 3 }
        };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                b[i][j] = a[i][j] + b[i][j];
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

    }
}
