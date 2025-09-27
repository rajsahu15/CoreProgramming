
/*
 * Method overloading
 * 
 * ----1----creating the same name method with different argument list passed is know as method overloading
 * ----2----it is a compile time polymorphism
 * ----3----it is also known as static binding
 * ----4----it is also known as early binding
 * ----5----return type can be same or different
 * ----6----access specifier can be same or different
 * ----7----method name must be same
 * ----8----main method can also be overloaded
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class MehtodOverri {
    static void add(int a, int b) {
        System.out.println("sum of two int value: " + (a + b));
    }

   static void add(int a, int b, int c) {
        System.out.println("sum of two int value: " + (a + b + c));

    }
   static void add(int a, int b,int c,int d) {
        System.out.println("sum of two int value: " + (a + b+c+d));
    }
    static void add(int a, int b, int c, int d,int e) {
        System.out.println("sum of two int value: " + (a + b + c+d+e));

    }
    public static void main(String[] args) {
      
        add(10, 20,30);

    }
}
