
import java.util.function.BiPredicate;

public class Bipre {
    public static void main(String[] args) {
        BiPredicate<String,Integer> bi=(s,i)->(s.length()==4)&&(i>2);
        System.out.println(bi.test("Ramm", 3));
    }
}
