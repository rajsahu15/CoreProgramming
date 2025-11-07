public class MethodInner {
    public static void show(){
         class Demo{
            void display() {
                System.out.println("This is method inner class");
            }
        }
        Demo d=new Demo();
        d.display();
    }
    public static void main(String[] args) {
        show();
    }
}
