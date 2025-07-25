import java.util.Scanner;

public class p3{
    public static void main(String[] args) {
        int x=1;
        System.out.print("\nEnter The No of Rows: ");

        int n=new Scanner(System.in).nextInt();
        for(int i=1;i<=n;i++)
        {
           for(int j=n;j>=i;j--)
           {
            if(!(j==i))
            {
            System.out.print(j+" ");    
            System.out.print("* ");
            }
           }
            System.out.println();
        }
    }
}
