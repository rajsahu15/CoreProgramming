public class MethodInnerJa {
   static class Demo {
        public static void main(String[] args) {
            System.out.println("This is method Democlass");
        }

    }

    public static void main(String[] args) {
        System.out.println("This is method inner class");
       
    }
}
class Test {
    public static void main(String[] args) {
        MethodInnerJa.Demo md=new MethodInnerJa.Demo();
        md.main(args); }
}   