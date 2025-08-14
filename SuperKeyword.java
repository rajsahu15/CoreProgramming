 class Parent {

    public Parent() {
         System.out.println("Constructor Called Parent");
    }

  
}

class Child extends Parent {

    public Child() {
        super();
        //super(); error
        //this(10);error
        System.out.println("Constructor Called CHILD");
    }
    public Child(int a){
        this();
       // this();error
        System.out.println("Child this cons");}

}

public class SuperKeyword {

    public static void main(String[] args) {
    Child c=new Child(10);
}
}
