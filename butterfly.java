public class butterfly {
    public static void main(String[] args) {
        int n=10;
        for(int i=1;i<=5;i++)
        {    n=n-2;
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int k=n;k>0;k--)
            { 
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
         for(int i=4;i>=1;i--)
        {    n=n+2;
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int k=1;k<=n;k++)
            { 
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
