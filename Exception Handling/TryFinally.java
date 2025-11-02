public class TryFinally {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b; // This will throw ArithmeticException
            System.out.println("Result: " + c);
        } finally {
            System.out.println("This block is always executed.");
        }
    }
}


//after finally exception will come
