import java.util.Scanner;

public class spy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NO: ");
        int n = sc.nextInt();
        int m=n;
        int prod=1;
        int sum=0;
        
        while(n!=0)
        {
            sum+=n%10;
            prod*=n%10;
            n=n/10;
        }
       if(prod==sum) System.out.println(m+" is Spy NO");
       else
       System.out.println(m+" is not a Spy NO");

    }
}
