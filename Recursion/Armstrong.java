public class Armstrong {
    public static void main(String[] args) {
        int number=0;
        int m=number;
        
        if(m==isArmstrong(number,0)&&m!=0)
        {
            System.out.println(number + " is an Armstrong number.");
        }
        else
        {
            System.out.println(number + " is not an Armstrong number.");
        }

    }
    public static int isArmstrong(int n,int s)
    {
       if(n==0)
       {
        return s;
       }
         int a=n%10;
         n=n/10;
         s=s+(a*a*a);
        return isArmstrong(n,s);
    }
}
