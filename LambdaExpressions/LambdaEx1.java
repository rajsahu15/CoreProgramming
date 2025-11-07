@FunctionalInterface
interface I1{
    int sum(int a,int b);
}
public class LambdaEx1 {
    public static void main(String[] args) {
        I1 i=(a,b)->a+b;
        i.sum(10,20);
        System.out.println(i.sum(10,20));
    }
}
