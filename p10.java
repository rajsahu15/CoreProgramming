import java.util.Scanner;
//incorrect
public class p10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    
        /* 
        for(int i=1;i<=n;i++)
        {
         for(int j=1;j<=n;j++)
         {
           if(i==1||(i==j)&&(i<=n/2+1)||i+j==n+1&&(i<n/2+1))   System.out.print("*");
           else
           System.out.print(" ");
         }   

        System.out.println();
        }

    Patience and Remove OverConfidence
    then only you will get what you want





*/
       for(int i=n;i>=1;i--)
       {
        for(int j=i;j<=n;j++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            if(i==n||j==1||j==i)
            System.out.print("* ");
            else
            System.out.print("  ");
        }
        System.out.println();
       }
     


    }
}
