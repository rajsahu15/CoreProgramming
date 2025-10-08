class Node {
    Object ele;
    Node next;
    Node prev;

    Node(Object ele) {
        this.ele = ele;
        this.next = null;
        this.prev = null;
    }

    Node(Object ele, Node next, Node prev) {
        this.ele = ele;
        this.next = next;
        this.prev = prev;
    }
}

public class DoubleLinkedList {
    private Node first;
    private Node last;
    private int size;

    public void add(Object element) {
        if (first == null) {
            first = new Node(element);
            last = first;
            size++;
            return;
        }
        last.next = new Node(element, null, last);
        last = last.next;
        size++;

    }

    public int size() {
        return size;
    }

    public void add(Object element, int index) {
        if (index <= -1 || index >= size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (index == 0) {
            Node newNode = new Node(element, first, null);
            first.prev = newNode;
            first = newNode;
            size++;
            return;
        }

        Node current = first;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        Node newNode = new Node(element, current.next, current);
        current.next.prev = newNode;

        current.next = newNode;
        size++;
    }

    public void remove(int index) {
        if (index <= -1 || index >= size())
            throw new IndexOutOfBoundsException();

        if (index == 0) {
            first = first.next;
            if (first != null) {
                first.prev = null;
            } else {
                last = null;
            }
            size--;
            return;
        }
        Node curr = first;
        for (int i = 1; i < index; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        if (curr.next != null) {
            curr.next.prev = curr;
        } else
            last = curr;
            size--;
    }
    public void reverse() {
        if (size() <= 1)
            return;
        Node curr = first;
        Node temp = null;
        while (curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        if (temp != null) {
            first = temp.prev;
        }
    }

    public String toString() {
        if (size() == 0)
            return "[]";
        String s1 = "[" + first.ele;
        Node curr = first;
        while (curr.next != null) {
            curr = curr.next;
            s1 = s1 + "," + curr.ele;
        }
        s1 = s1 + "]";
        return s1;
    }

}
