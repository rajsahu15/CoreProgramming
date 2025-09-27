class jussP
{
    public static void main(String[] args) {
        int a=0; char ch='A';
        for(int i=1;i<=5;i++)
        {
        
            for(int k=i;k<=5;k++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {   if(j==1||i==5)
                System.out.print(ch+++" ");
                else
                System.out.print(++a+" ");
            }
            for(int j=1;j<i;j++)
            {   if(j==i-1||i==5)
                System.out.print(ch+++" ");
                else
                System.out.print(++a+" ");
            }
            
          
            System.out.println();
            
        }
    }
}