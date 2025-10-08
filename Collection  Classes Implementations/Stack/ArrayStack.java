import java.util.EmptyStackException;

public class ArrayStack {
    private Object a[] = new Object[5];
    private int size = 0;

    public void push(Object e) {
        if (size >= a.length)
            resize();
        a[size++] = e;
    }

    private void resize() {
        Object temp[] = new Object[a.length + 3];
        for (int i = 0; i < a.length; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }

    public Object pop() {
        if (isEmpty())
            return new EmptyStackException();
        Object e = a[--size];
        a[size] = null;
        return e;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public Object peek() {
        if (isEmpty())
            return new EmptyStackException();
        return a[size - 1];

    }
}
