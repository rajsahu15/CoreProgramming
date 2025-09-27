public class FreqofEach {
        public static void main(String[] args) {
            String str = "hello world";
             str = str.toLowerCase();
          
     
            for (int i = 0; i < str.length(); i++) {
                int count = 1;
                boolean found = false;
                for (int j = 0; j < i; j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    for (int j = i + 1; j < str.length(); j++) {
                        if (str.charAt(i) == str.charAt(j)) {
                            count++;
                        
                    }
               }      System.out.println(str.charAt(i)+ "=" + count);
               
            }
        }
    }
}