public class AnagramString {
    public static void main(String[] args) {
        String str1 = "abced";
        String str2 = "abcde";
   
        if (isAnnagram(str1, str2))
            System.out.println(str1 + ", " + str2 + " is Annagram");

    }

    public static boolean isAnnagram(String s1, String s2) {  
       
        if(s1.length()==0 && s2.length()==0) return true;
       
        if (s1.length() != s2.length())                                          
            return false;

        char ch = s1.charAt(0);
        s1 = s1.replace("" + ch, "");

        s2 = s2.replace("" + ch, "");

        return isAnnagram(s1, s2);
    }

}