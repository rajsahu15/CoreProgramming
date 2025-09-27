public class matchingPaircount {
    public static void main(String[] args) {
        String str = "abcdabbaab";
        String key = "ab";
        int count=0;
 
       for(int i=0;i<str.length()-1;i++)
       {
               String s=""+str.charAt(i)+str.charAt(i+1);
               if(s.equals(key))
               {
                count++;
               }
       }
       System.out.println(count);


    }
}
