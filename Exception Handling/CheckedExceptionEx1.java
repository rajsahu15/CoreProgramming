import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionEx1 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("nonexistentfile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. " + e.getMessage());
        }
    }
}
//In this example, we are trying to create a FileInputStream for a file that does not exist.
// This will throw a FileNotFoundException, which is a checked exception.   
// We handle this exception using a try-catch block, and print an error message when the exception occurs.
//Checked exceptions are exceptions that are checked at compile-time.

// If a method can throw a checked exception, it must either handle the exception using a try-catch block
// or declare the exception using the throws keyword in the method signature.