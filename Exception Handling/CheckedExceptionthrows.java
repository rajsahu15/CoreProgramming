import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionthrows {
    public static void main(String[] args) {
        try {
            methodThatThrowsException();
        } catch (FileNotFoundException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
    public static void methodThatThrowsException() throws FileNotFoundException {
    
            FileInputStream fis = new FileInputStream("nonexistentfile.txt");
        
        }
}
