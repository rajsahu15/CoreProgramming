public class r1Palindrome {
    public static void main(String[] args) {
    palindromeFrom(1, 100,0);    
    
    }
    public static int palindromeFrom(int start,int end,int count)
    {  
        if(end<=start-1){return 0;}
        if(isPalindrome(end,0,end))
        {   count++;
            if(count==2)
            System.out.println(end);
        }

        return palindromeFrom(start, --end,count);
      
    }

    public static boolean isPalindrome(int n,int sum,int m)
    {  
        if(m==0)return false;
        if(n==0){return sum==m;}
        
        return isPalindrome(n/10, sum*10+n%10, m);
    }


}
//reverse palindrome using recursion in given range