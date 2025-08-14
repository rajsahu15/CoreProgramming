
import java.util.Scanner;

public class CurrencyCalc {
    public static void main(String[] args) {
        System.out.println("Enter the amount in Rs");
        int Currency=new Scanner(System.in).nextInt();

        if(Currency>=2000)
        {
            System.out.println("You Need "+Currency/2000+" 2000 Rs Notes");
            Currency = Currency % 2000;
        }
        if(Currency>=500)
        {
            System.out.println("You Need "+Currency/500+" 500 Rs Notes");
            Currency = Currency % 500;
        }
        if(Currency>=200)
        {
            System.out.println("You Need "+Currency/200+" 200 Rs Notes");
            Currency = Currency % 200;
        }
        if(Currency>=100)
        {
            System.out.println("You Need "+Currency/100+" 100 Rs Notes");
            Currency = Currency % 100;
        }   
        if(Currency>=50)
        {
            System.out.println("You Need "+Currency/50+" 50 Rs Notes");
            Currency = Currency % 50;
        }
        if(Currency>=20)
        {
            System.out.println("You Need "+Currency/20+" 20 Rs Notes");
            Currency = Currency % 20;
        }
        if(Currency>=10)
        {
            System.out.println("You Need "+Currency/10+" 10 Rs Notes");
            Currency = Currency % 10;
        }   
        if(Currency>=5)
        {
            System.out.println("You Need "+Currency/5+" 5 Rs Notes");
            Currency = Currency % 5;
        }   
        if(Currency>=2)
        {
            System.out.println("You Need "+Currency/2+" 2 Rs Notes");
            Currency = Currency % 2;
        }   
        if(Currency>=1)
        {
            System.out.println("You Need "+Currency/1+" 1 Rs Notes");
            Currency = Currency % 1;
        }   
        if(Currency == 0)
        {
            System.out.println("All currency has been converted.");
        }
        else
        {
            System.out.println("Remaining amount: " + Currency + " Rs");
        }   
        

    }
}
