import java.util.HashSet;
import java.util.Set;

public class hashSetTest {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2); 
        set.add(3);
        set.add(2); 
        set.add(5);
        System.out.println(set);
        // Duplicate, will not be added
        //set methods
        System.out.println("Set contains 2: " + set.contains(2)); // true
        System.out.println("Set size: " + set.size()); // 3
        set.remove(2);
        System.out.println("Set contains 2 after removal: " + set.contains(2));
        System.out.println("Set size after removal: " + set.size()); // 2
        set.clear();
        System.out.println("Set size after clear: " + set.size()); // 0


    }
}
