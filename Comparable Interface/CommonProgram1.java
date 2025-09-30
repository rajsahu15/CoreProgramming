
import java.util.Arrays;

public class CommonProgram1 {
    public static void main(String[] args) {
        Emp a[] = { new Emp("Rishi", 23), new Emp("Raj", 24), new Emp("Prati", 25) };
        Arrays.sort(a);
        for (Emp e : a) {
            System.out.println(e);
        }
    }
}
