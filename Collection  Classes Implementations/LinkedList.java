
class Node {
    Object data;
    Node next;

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

}

public class LinkedList {
    private Node first = null;
    private Node last = null;
    private int size = 0;

    public void add(Object element) {
        if (first == null) {
            Node newNode = new Node(element, null);
            first = newNode;
            last = newNode;
            size++;
            return;
        }
        last.next = new Node(element, null);
        last = last.next;
        size++;
    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node current = first;
        for (int i = 1; i <= index; i++) {
            current = current.next;
        }
        return current.data;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        String str = "[" + first.data + ", ";
        Node current = first;
        while (current.next != null) {
            current = current.next;
            str += current.data ;
            if (current.next != null) {
                str += ", ";
            }
        }
        str = str + "]";
        return str;
    }

    public void add(Object element, int index) {
        if (index <= -1 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (index == 0) {
            first = new Node(element, first);
            size++;
            return;
        }
        Node current = first;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        current.next = new Node(element, current.next);
        size++;
    }

    public void remove(int index) {
        if (index < -1 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (index == 0) {
            first = first.next;
            if (first == null) {
                last = null;
            }
            size--;
            return;
        }
        Node current = first;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        if (current.next == null) {
            last = current;
        }
        size--;
    }

    public void reverse() {
        if (size <= 1) {
            return;
        }
        Node prev = null;
        Node current = first;
        Node next = null;

        while (current != null) {
            next = current.next; // Store next node
            current.next = prev; // Reverse the link
            prev = current; // Move prev to current
            current = next; // Move to next node
        }
        last = first; // Update last to the old head
        first = prev;
        // Update first to the new head of the reversed list
    }

}
