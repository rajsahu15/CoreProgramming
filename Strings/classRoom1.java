public class classRoom1 {

    public static void main(String[] args) {

        String s1 = "Rashmi aei";
        String s2 = "aeiou";
        for (int i = 0; i < s2.length(); i++) {
            if (!s1.contains("" + s2.charAt(i))) {
                System.out.println(s2.charAt(i));
            }
        }

        /*
         * String s1="a quick brown fox jumps over the lazy dog";
         * boolean bool =true;
         * for(char ch='a';ch<'z';ch++)
         * {
         * if(!s1.contains(""+ch))
         * {
         * System.out.println("not a panagram");bool =false;break;
         * }
         * }
         * if(bool)
         * {
         * System.out.println("IT IS A PANAGRAM");
         * }
         */

        /*
         * for(int i=0;i<s1.length();i++)
         * {
         * if(!s2.contains(""+s1.charAt(i)))
         * {
         * s2=s2+s1.charAt(i);
         * }
         * }
         * System.out.println(s2);
         */

    }
}
