import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        int x=1;
        System.out.print("\nEnter The No of Rows: ");

        int n=new Scanner(System.in).nextInt();
        for(int i=1;i<=n;i++)
        {
           for(int j=1;j<=n;j++)
           {
           if(i%2==1)
           {
            System.out.print(x+++" ");
           }
           else System.out.print(--x+" ");
           }
            x=x+n; 
            System.out.println();
        }
    }
}
