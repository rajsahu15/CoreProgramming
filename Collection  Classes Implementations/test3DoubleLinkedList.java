public class test3DoubleLinkedList {
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.add(10);
        dll.add(20);
        dll.add(30);
        dll.add(40);
        dll.add(60);

        System.out.println(dll);
        dll.remove(dll.size()-1);
        System.out.println(dll);
        dll.add(100, 1);
        System.out.println(dll);
        
         

    }
}
