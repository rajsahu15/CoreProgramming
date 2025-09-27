abstract class A {
   static int a=10;int b=20;
    public abstract void show();

    abstract void show2();

    static void show3() {
        System.out.println("A class Show 3");
    }
}

abstract class B extends A {
    int a,b;
    public void show() {
        System.out.println("CLASS -B show ");
    }
     void show5() {
        System.out.println("B class Show 5");
    }
}

class C extends B {
    int a,b;
    public void show2() {
        System.out.println("CLASS -C show 2");
    }

    void show4() {
        System.out.println("C class Show 4");
    }

}

public class Upcasting {
    public static void main(String[] args) {
        A a1 = new C();
        C c=(C)a1;
        System.out.println(A.a);
        System.out.println(a1.b);
        A.show3();
        c.show5();
        

    }
}