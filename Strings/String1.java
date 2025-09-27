public class String1 {
    public static void main(String[] args) {
        String str = "hello world";
        char ch[] = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            int count = 0;
            boolean flag = false;
            for (int j = 0; j < str.length(); j++) {
                if (ch[i] == ch[j]&&i!=j)
                    flag = true;
            }
            if (flag) {
                for (int j = 0; j <= i; j++) {
                    if (ch[i] == ch[j]) {
                        count++;
                    }
                }
                System.out.println(count);
            }
            else
            System.out.println(ch[i]+" "); 

        }
    }
}
