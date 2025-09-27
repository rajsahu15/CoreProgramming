
public class methods {

    public static void main(String[] args) {
        for (int i = 0; i <= 123; i++) {
           // System.out.println(i + " IS A PRIME: " + isPrime(i, 2));
          if(isSPYNO(i, 1, 0)) System.out.println(i+" IS A SPY");
        }

    }

    public static boolean isPrime(int n, int count) {
        if (n == 0) {
            return false;
        }

        if (n == 1 || count > n / 2) {
            return true;
        }

        if (n % count == 0) {
            return false;
        }

        return isPrime(n, ++count);
    }
    public static boolean isPalindrome(int n,int m,int sum) {
        if(sum==m &&m!=0) return true;
        if(n==0) return sum==m;
        sum=sum*10+n%10; 
        return isPalindrome(n/10, m, sum);
}
    public static boolean isSPYNO(int n,int prod,int sum) {
     
         if(sum==prod&&n==0) return true;
         if(n==0) return false;
         
         return isSPYNO(n/10, prod*n%10, sum+n%10);
    }
    public static boolean isSPerfect(int n,int sum,int a) {
     
        
         
       
    }



}
