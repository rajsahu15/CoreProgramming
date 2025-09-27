//constructor chaining using this keyword we can call any type of constructor 
//from the same class constructor
//Constructor call will be the first statement in constructor 
//we cannot use this keyword inside static block or static method
//one constructor can only call another constructor
class A {
    A() {
        this(10);
        System.out.println("A class NO ARGUMENTED CONSTRUCTOR-----0");
    }
    A(int a) {
        this(10, 200);
        System.out.println("A class Argumented Constructor-----1");
    }
    A(int a, int b) {
        System.out.println("A class Argumented Constructor ----- 2");
    } 
}
public class ConsChain {
    public static void main(String[] args) {
        A a1 = new A();
    }
}
