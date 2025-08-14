
class Armstrong {

    public static void main(String[] args) {

        for (int n = 1000; n <= 9999; n++) {
            int m = n;
            int count = 0;
            while (n != 0) 
            {
                count++;
                n = n / 10;
            }
            n = m;
            int sum = 0;

            int a;
            while (n != 0) {
                a = n % 10;
                sum = sum + (int) Math.pow(a, count);
                n = n / 10;
            }
            n=m;
            if (sum == m) {
                System.out.print(m + " ");
            }
        }



    }
}
