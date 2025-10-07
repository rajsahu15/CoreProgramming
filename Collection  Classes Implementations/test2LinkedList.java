public class test2LinkedList {
    public static void main(String[] args) {
        int k = 10;
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i <= 5; i++) {
            linkedList.add(k);
            k += 10;
        }

        System.out.println(linkedList);
        linkedList.add(110, 2);
        System.out.println(linkedList);
        linkedList.remove(1);
        System.out.println(linkedList);
        System.out.println(linkedList.size());
        linkedList.add(1000, linkedList.size()-1);
        linkedList.add(2000);
        System.out.println(linkedList);

    }
}
