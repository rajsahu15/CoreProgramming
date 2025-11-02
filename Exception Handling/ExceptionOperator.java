public class ExceptionOperator {
 public static void main(String[] args) {
        try {
            int arr[] = {1, 2, 3};
            System.out.println(arr[5]); // This will throw ArrayIndexOutOfBoundsException
            int c = arr[0] / 0; // This will throw ArithmeticException
            System.out.println("Result: " + c);
        } 
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } 
    }
}
//we can use only one parent in multi catch block
