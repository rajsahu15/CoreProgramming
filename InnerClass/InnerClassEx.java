//inner class is a class inside another class and the inner class is non static

public class InnerClassEx {
    int a=10;
    class InnerOne{
        int a=100; 
        void show() {
            System.out.println("This is inner class: "+a);
        }
    } 
    public static void main(String[] args) {
        InnerClassEx obj=new InnerClassEx();
        InnerClassEx.InnerOne in=obj.new InnerOne();
        in.show();

    }
}
