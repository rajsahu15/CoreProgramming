class A{
    public static void main(String[] args) {
    int a=10;
    m1(a);
    }
    public static void m1(int a) {
       if(a==5) {
        System.out.println("Reached base case with a: " + a);
            return;
        }
        m1(--a);
        System.out.println("Value of a: " + a);
    }
}