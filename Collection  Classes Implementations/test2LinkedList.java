public class test2LinkedList {
    public static void main(String[] args) {
        int k = 10;
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i <= 5; i++) {
            linkedList.add(k);
            k += 10;
        }

        System.out.println(linkedList);

    }
}
