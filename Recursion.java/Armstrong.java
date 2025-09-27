public class Armstrong {
  public static void main(String[] args) {
   System.out.println( isArmstrong(1634, 1634, 0, 4));
  }

  static boolean isArmstrong(int n,int m,int sum,int digit)
  {
    if(n==0&&m==sum)return true;
    if(n==0)return false;
      sum=sum+(int)Math.pow(n%10, digit);
     return isArmstrong(n/10, m, sum, digit);
  }
}
