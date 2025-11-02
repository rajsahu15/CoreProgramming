class InvalidAgeException extends RuntimeException {
 
    public InvalidAgeException() {
        super("Invalid age provided. Age must be between 0 and 150.");
    }
    public InvalidAgeException(String message) {
        super(message);
    }
    
}

public class CustonException {
    public static void main(String[] args) {
        int age = 200; // Example age that is invalid
            if (age < 0 ) {
                throw new InvalidAgeException();
            }
            if(age > 150) {
                throw new InvalidAgeException("Age cannot be greater than 150.");
            }

        
    }
}
