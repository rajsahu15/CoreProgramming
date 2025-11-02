//Throwable class in Java is the superclass of all errors and exceptions in the Java language.
// It has two main subclasses: Error and Exception.
                    //Throwable
           //Error                               Exception
    //OutOfMemoryError          Checked Exception              RuntimeException(Unchecked Exception)
    //StackOverflowError         IOException                   
                            //  SQLException                   NullPointerException    
                            //  ClassNotFoundException         ArrayIndexOutOfBoundsException
                            //FileNotFoundException            //  ArithmeticException
                                                               //  IllegalArgumentException
                                                               //  NumberFormatException
                                                               //StringIndexOutOfBoundsException  
                                                        
public class ExceptionEx1{
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b; // This will throw ArithmeticException
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}