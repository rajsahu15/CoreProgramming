public class perfect {
    public static void main(String[] args) {
        System.out.println(isPerfect(28, 0, 1));
    }
    public static boolean isPerfect(int n,int sum,int fact)
    {
        if(fact>n/2&&sum==n)return true;  
        if(fact>n/2)return false;  
         
        if(n%fact==0)
           {
            sum=sum+fact;
           }
           fact++;
        
           return isPerfect(n, sum, fact);
         
    }
}
