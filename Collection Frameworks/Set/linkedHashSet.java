
import java.util.LinkedHashSet;
import java.util.Set;

public class linkedHashSet {
    public static void main(String[] args) {
        Set<Integer>set = new LinkedHashSet<>();
        set.add(5);
        set.add(1);
        set.add(2); 
        set.add(3); 
        set.add(2); // Duplicate, will not be added
        System.out.println(set);
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
