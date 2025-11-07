import java.util.function.Consumer;
import java.util.function.Supplier;

public class SuppliCons {
    public static void main(String[] args) {
        Consumer<Integer> c = i -> {
            System.out.println(i);
        };
        c.accept(10);
        Supplier<Integer>s =()->1;
          
    }
}
