//nested class is a class inside another class and the inner class is static

public class NestedClass {
    static int i=10;
    static class InnerClass {

        void display() {
            System.out.println("This is a static nested class: "+i);
        }
    }

    public static void main(String[] args) {
                NestedClass.InnerClass a=new NestedClass.InnerClass();
                a.display();
    }
}
