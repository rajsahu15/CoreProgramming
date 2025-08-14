class concept
{
    public static void main(String[] args) {
        A:
        for(int i=1;i<=5;i++)
        {   
            for(int j=1;j<=5;j++)
            {
            System.out.print(" *");
            break A;
            }
            System.out.println();
        }
    }
}