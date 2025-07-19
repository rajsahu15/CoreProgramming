import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        int a=new Scanner(System.in).nextInt();
        if((a&1)==0)
        {
            System.out.println("even");
        }
        else if((a&1)==1)
        {
         System.out.println("Odd");
        }
       

    }
}
