@FunctionalInterface
interface Maths{
    int square(int a);
}
@FunctionalInterface
interface Printt{
    void printt();
}

public class Square {
    public static void main(String[] args) {
      Maths m=(i)->{System.out.println("Jai Shree Ram");
                     return i*i;
        };
        System.out.println(m.square(5));
        Printt p=()->System.out.println("Hare Krishna");
        p.printt();
    }
}
