public class test1ArrayQueue {
    public static void main(String[] args) {
        ArrayQueue aq = new ArrayQueue();
        System.out.println(aq.isEmpty());
        System.out.println(aq.Size());
        aq.add(1);
        aq.add(2);
        aq.add(3);
        aq.add(4);
        aq.add(5);
        aq.add(6);
        System.out.println(aq.isEmpty());
        System.out.println(aq.Size());
        System.out.println(aq.peek());
        System.out.println(aq.Size());
        System.out.println(aq.poll());
        System.out.println(aq.Size());
    }
}
