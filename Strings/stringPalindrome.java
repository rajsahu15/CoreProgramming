class stringPalindrome
{
     public static void main(String[] args) {
        String s="malayalam";
        String bigString="";
        String shortString=s;
        
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+3;j<s.length();j++)
            {
                String str=s.substring(i,j);
               if(isPalindrome(str))
                {   
                    if(str.length()>bigString.length())
                    bigString=str;
                    if(str.length()<shortString.length())
                    shortString=str;
                    

                }
            }
        }
        System.out.println(bigString);
        System.out.println(shortString);
     }
     public static boolean isPalindrome(String s)
     {
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;

        }
        return true;
     }
}