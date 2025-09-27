public class perfectNo {
    public static void main(String[] args) {
      int start=1;
      int end=200;
      int product;
      int sum;
      int count =0;
      for(int i=start;i<=end;i++)
      {
        product=1;
        sum=0;
        int n=i;
        while(n!=0)
        {
           sum=sum+ n%10;    //last digit sum
           product=product*n%10;   //last digit product
           n=n/10;   //remove last digit
        }
        if(sum==product)
        {
            count++;
            if(count==10)
            System.out.println(count+" = "+i);
        
        }
        }
      
    }
}

//123
//1+2+3=6
//1*2*3=6