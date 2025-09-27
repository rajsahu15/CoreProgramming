public class AutoMorphic {
   public static void main(String[] args) {
    System.out.println(isAutoMorph(5, 25, 0, 1));
   }
   public static boolean isAutoMorph(int n,int sq,int sum,int help){
    if(sum>n)return false;
    if(n==sum)return true;
    
    sum=sq%help;
    return isAutoMorph(n, sq, sum, help*10);
   
    }
}
