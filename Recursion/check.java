public class check
{
    public static void main(String[] args) {
        int i=get(10);
        System.out.println("Final value: " + i);
    }

public static int get(int n) {
    if (n == 0) {
        return n;
    }
    System.out.println(n);
    return get(n-1);
    
}
}