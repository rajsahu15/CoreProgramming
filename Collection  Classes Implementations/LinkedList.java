
class Node{
    Object data;
    Node next;
    public Node(Object data, Node next){
        this.data=data;
        this.next=next;
    }

}

public class LinkedList {
    private Node first=null;
    private Node last=null;
    private int size=0;

    public void add(Object element){
              if(first==null){
                  Node newNode=new Node(element,null);
                  first=newNode;
                  last=newNode;
                  size++;
                  return;
                }
                last.next=new Node(element,null);
                last=last.next;
                size++;
    }
    public int size(){
        return size;
    }
    public Object get(int index){
        if(index<0||index>=size){
            throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
        }
        Node current=first;
        for(int i=1;i<=index;i++){
            current=current.next;
        }
        return current.data;
    }

   }

