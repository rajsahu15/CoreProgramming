public class vowelsCount {
    public static void main(String[] args) {
        int count =0;
        String vowels="aeiou";
        String str="jaishreeram";
        char ch[]=str.toCharArray();
       
        for(int i=0;i<str.length();i++)
        {
              if(vowels.contains(""+str.charAt(i)))
              {
                count++;
              }
        }
        if(count>=3)
        {
        System.out.println(convertVowels(str,vowels));
        }
        else
        System.out.println(str);
    }
    public static char[] convertVowels(String str,String vowels)
    {    char ch[]=str.toCharArray();
         for(int i=0;i<ch.length;i++)
        {
              if(vowels.contains(""+ch[i]))
              {
                ch[i]='_';
              }
        }
     return  ch;
    }
}
