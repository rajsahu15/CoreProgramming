public class Spy {
    public static void main(String[] args) {
        System.out.println(isStrong(1, 1, 0));
    }
   
    static boolean isSpy(int n, int prod, int sum) {
        if (prod == sum)
            return true;
        if (n == 0)
            return false;
        prod = (n % 10) * prod;
        sum = sum + (n % 10);

        return isSpy(n / 10, prod, sum);
    }
    
    static boolean isStrong(int n, int m, int sum) {
        if (m == sum)
            return true;
        if (n == 0)
            return false;
        sum = sum + fact(n % 10, 1);
        return isStrong(n / 10, m, sum);
    }
   
    static int fact(int a, int prod) {
        if (a == 0)
            return prod;
        prod = prod * a;
        a--;
        return fact(a, prod);
    }

}
