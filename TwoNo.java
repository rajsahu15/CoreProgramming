import java.util.Scanner;
public class TwoNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter First Value:");
        int a=sc.nextInt();
        
        System.out.println("Enter Second Value:");
        
        int b=sc.nextInt();

        if(a>b)
        {
            System.out.println(a+" is Largest");
        }
        else if(b>a)
        {
            System.out.println(b+" is Largest");
        }
        else{
            System.out.println("both equal");
        }
      
    }
}
