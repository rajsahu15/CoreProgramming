public class palindrome {
  public static void main(String[] args) {
    int low=11;
    int high=11;
    
    for(int i=10;i<=150;i++)
    {
    if(palindromecheck(i)){
        
        if(i>high){high=i;}
        if(i<low){low=i;}
     }
    }
    System.out.println("Highest= "+high);
    System.out.println("Lowest= "+low);
    
    
   
  }  
  public static boolean palindromecheck(int n)  
  {
    int a;
    int rev=0;
    int m=n;
    while(n!=0)
    {
        a=n%10;
        n=n/10;
        rev=rev*10+a;
    }
    if(m==rev)
    return true;
    else
    return false;
  }

}
