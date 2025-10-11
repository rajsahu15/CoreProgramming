
import java.util.Set;
import java.util.TreeSet;

public class treeSet {
     public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(1); 
        set.add(2);
        //set.add(null); null pointer exception
        set.add(3); 
        System.out.println(set);        
        

     }   
}
