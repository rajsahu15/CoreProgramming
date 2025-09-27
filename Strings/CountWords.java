public class CountWords{
 
    public static void main(String[] args) {
        String s="BO   SS   SA A";
            //    0123456789
        //BOS$S$A$
        int j=0;
        int count=0;

        
        while(j<s.length())
        {
            while(j<s.length()&&s.charAt(j)!=' ')
            {
                j++;
            }
         if(j>=s.length()){count++;break;}  

         while(s.charAt(j)==' ') j++;
       
 
          count++;
           

        }
        System.out.println(count);
      
        
    }
}
