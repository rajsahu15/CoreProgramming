class Prime {
    public static void main(String[] args) {
     primeRange(0, 100);
    }
    public static void primeRange(int start,int last)
    {   
        if(start>last){return;}
    
        if(isPrime(start, 2))
        System.out.println(start); 
    
        start++;

        primeRange(start, last);
    }

    public static boolean isPrime(int n,int a)
    {   if(n==0||n%a==0)return false;
        if(a>n/2)return true;
        a++;
        return isPrime(n, a);
    }
}