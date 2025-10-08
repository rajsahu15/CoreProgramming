public class test2LinkedListQueue {
    public static void main(String[] args) {
        LinkedListQueue llq = new LinkedListQueue();
        System.out.println(llq.isEmpty());
        System.out.println(llq.Size());
        llq.add(1);
        llq.add(2);
        llq.add(3);
        llq.add(4);
        llq.add(5);
        llq.add(6);
        System.out.println(llq.isEmpty());
        System.out.println(llq.Size());
        System.out.println(llq.peek());
        System.out.println(llq.Size());
        System.out.println(llq.poll());
        System.out.println(llq.Size());
    }
}
