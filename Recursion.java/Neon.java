public class Neon {
   public static void main(String[] args) {
    System.out.println(isNeon(8, 64, 0));
   }
   public static boolean isNeon(int n,int sq,int sum){
    if(n==sum)return true;
    if(sq==0)return false;
    sum=sq%10+sum;
    return isNeon(n, sq/10, sum); 
   } 
}
