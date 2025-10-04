
import java.util.Arrays;

public class ArrayList {
    private Object[] elements=new Object[5];
    private int size;

    public void add(Object element) {
        if (size >= elements.length) 
            resize();
            elements[size++] = element;
        
    }
    private void resize(){
        Object[] temp=new Object[elements.length+3];
        for(int i=0;i<elements.length;i++){
            temp[i]=elements[i];
        }
        elements=temp;
    }
    public int size() {
        return size;
    }
    @Override
    public String toString() {
       return "ArrayList{" +
               "elements=" + Arrays.toString(elements) +
               ", size=" + size +
               '}';
    }
    public void add(int index,Object element){
        if(size>=elements.length){
            resize();
        }
        for(int i=size-1;i>=index;i--){
            elements[i+1]=elements[i];
        }
        elements[index]=element;
        size++;
    }
    public Object get(int index){
        if(index<0||index>=size){
            throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
        }
        return elements[index];
    }
    public void remove(int index){
        if(index<0||index>=size){
            throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
        }
        for(int i=index+1;i<size;i++){
            elements[i-1]=elements[i];
        }
        elements[--size]=null;
    }
}
