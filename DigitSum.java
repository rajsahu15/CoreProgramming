import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER A NO: ");
    int n=sc.nextInt();
    int sum=0;
    while(n!=0)
    {
        sum+=n%10;
        n=n/10;
        if(n==0&&sum>9)
        {
            
            n=sum;
            System.out.println(sum);
            sum=0;

        }
    }
    System.out.println("SingleUnitSum=:"+sum);



    }
}
