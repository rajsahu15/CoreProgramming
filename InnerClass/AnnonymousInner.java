@FunctionalInterface
interface Demo{
    void show();
}
public class AnnonymousInner {
 public static void main(String[] args) {
    Demo d=new Demo() {
        public void show() {
            System.out.println("This is annonymous inner class");
        }
    };
    d.show();
 }   
}
