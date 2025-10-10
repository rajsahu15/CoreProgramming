
import java.util.PriorityQueue;

public class testPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comporatorc());
        pq.add(0);
        pq.add(10);
        pq.add(2);
        pq.add(5);
        pq.add(15);
        pq.add(25);
        
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
}
class Comporatorc implements java.util.Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        return a - b; 
    }
}
