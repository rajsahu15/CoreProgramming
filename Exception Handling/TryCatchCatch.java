public class TryCatchCatch {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will throw ArrayIndexOutOfBoundsException
            System.out.println(10 / 0); // This will throw ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        }
        catch(ArithmeticException e) {
            System.out.println("Error: Arithmetic exception occurred.");
        }
        catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }   
}
//In this example, we have multiple catch blocks to handle different exceptions separately.
// If an ArrayIndexOutOfBoundsException occurs, the first catch block will handle it.
// If an ArithmeticException occurs, the second catch block will handle it.
// The last catch block is a general catch for any other exceptions that may occur.
    
