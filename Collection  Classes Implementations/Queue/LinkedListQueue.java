class Node {
    Object ele;
    Node next;

    Node(Object e) {
        ele = e;
        next = null;
    }
}

public class LinkedListQueue {
    private Node first;
    private Node last;
    private int size = 0;

    public void add(Object e) {
        if (first == null) {
            first = new Node(e);
            last = first;
            size++;
            return;
        }
        last.next = new Node(e);
        last = last.next;
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int Size() {
        return size;
    }

    public Object poll() {
        if (isEmpty()) {
            return null;
        }
        Object temp = first.ele;
        first = first.next;
        if (first == null)
            last = null;
        size--;
        return temp;

    }
    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return first.ele;
    }
    
}
