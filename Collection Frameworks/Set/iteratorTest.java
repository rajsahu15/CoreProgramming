
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class iteratorTest {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(1);
        set.add(2);
        
        Iterator<Integer>i = set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
