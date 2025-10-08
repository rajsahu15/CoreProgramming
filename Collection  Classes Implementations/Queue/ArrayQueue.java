public class ArrayQueue {
    private Object[] a = new Object[5];
    private int size = 0;

    private void resize() {
        Object[] temp = new Object[a.length + 3];
        for (int i = 0; i < a.length; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }

    public boolean isEmpty() {
        return Size() == 0;
    }

    public int Size() {
        return size;
    }

    public void add(Object e) {
        if (size >= a.length) {
            resize();
        }
        a[size++] = e;
    }
    //return first element without removing it
    public Object peek(){
        if (isEmpty()) {
            return null;
        }
        return a[0];
    }
    //return first element and remove it
    public Object poll(){
        if (isEmpty()) {
            return null;
        }
        Object temp = a[0];
        for (int i = 1; i < Size(); i++) {
            a[i-1] = a[i];
        }
        a[--size] = null;
        return temp;
    }

}
