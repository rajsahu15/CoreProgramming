import java.util.PriorityQueue;

class TopKElement {
     public int[] findTopKLargest(int[] nums, int k) {
         PriorityQueue<Integer> pq = new PriorityQueue<>();

         for (int i = 0; i < k; i++) {
             pq.add(nums[i]);
         }

         for (int i = k; i < nums.length; i++) {
             if (nums[i] > pq.peek()) { 
                 pq.poll();      
                 pq.add(nums[i]); 
             }
         }
         
         int[] result = new int[k];
         for (int i = 0; i < k; i++) {
             result[i] = pq.poll(); 
         }

         return result;
     }
}


public class TesttopKElements {
    public static void main(String[] args) {
        
        TopKElement solution = new TopKElement(); 
        int[] nums = {3, 1, 5, 12, 2, 11,100,100};
        int k = 3;
        int[] topK = solution.findTopKLargest(nums, k);
        
        System.out.println("Top " + k + " largest elements:");
        for (int num : topK) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}