
import java.util.Comparator;
import java.util.PriorityQueue;
class Comporatorc implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
             return (int)o2-(int)o1;
    }
    
     
   
}

class TopKElement {
    public int[] findTopKLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comporatorc());
        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
        }
        int res[] = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = pq.poll();
        }
        return res;
    }
}

public class TesttopKElements {
    public static void main(String[] args) {

        TopKElement solution = new TopKElement();
        int[] nums = { 3, 1, 5, 12, 2, 11, 100, 100 };
        int k = 3;
        int[] topK = solution.findTopKLargest(nums, k);

        System.out.println("Top " + k + " largest elements:");
        for (int num : topK) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}