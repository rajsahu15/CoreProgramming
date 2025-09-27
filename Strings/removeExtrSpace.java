public class removeExtrSpace {
    public static void main(String[] args) {
        String str = "Jai     Shr    ee    Ram";
        String s = "";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count=1;
                s = s + str.charAt(i);

            } else {
              if(count==1)s=s+" ";
              count++;
            }

        }
        System.out.println(s);

    }
}
