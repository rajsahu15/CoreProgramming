
import java.util.LinkedList;
import java.util.Queue;


public class testQueue {
    public static void main(String[] args) {
         
        Queue<String> queue = new LinkedList();
        queue.add("Hello");
        queue.add("World");
        queue.add("Java");
        System.out.println(queue);
        System.out.println("Head of the queue: " + queue.peek());
        System.out.println("Removed from the queue: " + queue.poll());
        System.out.println(queue);
        System.out.println("Is the queue empty? " + queue.isEmpty());
        System.out.println("Size of the queue: " + queue.size());
        queue.clear();
        System.out.println("Queue after clear operation: " + queue);
        System.out.println("Is the queue empty? " + queue.isEmpty());

        
    }
}
