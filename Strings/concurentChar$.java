public class concurentChar$ {
   public static void main(String[] args) {
        String str = "Boss";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                result.append(str.charAt(i));
                result.append('$');
                i++;
            } else {
                result.append(str.charAt(i));
            }
        }
        System.out.println("Input:  " + str);
        System.out.println("Output: " + result.toString());
    }
}
