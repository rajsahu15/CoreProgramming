class palindrome
{
    public static void main(String[] args) {
        int originalNumber;
         int reversedNumber;
        for(int i=0;i<=100;i++)
        {

          originalNumber = i;
           
         reversedNumber = RevNo(originalNumber, 0);

             
            if (originalNumber == reversedNumber && originalNumber!=0) {
                System.out.println(originalNumber + " Is A Palindrome");
            } 
        }
    }
    public static int RevNo (int n,int rev)
    {
    if(n==0)
    {
        return rev;
    }
    int a=n%10;
    rev=rev*10+a;
    n=n/10;
    return RevNo(n, rev);    
    }
}
