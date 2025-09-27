public class freqOfEachchar {
    public static void main(String[] args) {
        String str = "javaa";
     
        for (int i = 0; i < str.length(); i++) {
            boolean found = false;
            int count = 1;
            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)&&i!=j) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j) && i != j) {
                        count++;
                    }

                }
                System.out.println(str.charAt(i) + " =" + count);
            }

        }

    }
}
