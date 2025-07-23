import java.util.Scanner;

public class strong {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
    System.out.println("ENTER A NO: ");
    int n=sc.nextInt();
    int a;
    int m=n;
    int sum=0;
    while(n!=0)
    {
        a=n%10;
        n/=10;
        int prod=1;
        for(int i=1;i<=a;i++)
        {
            prod*=i;
        }
        sum+=prod;

    }
if(sum==m)System.out.println(m+" is strong number");
else
System.out.println(m+" is not a strong number");

    }
}
