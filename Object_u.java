
class A {
   int a;  //non static
   static int b;  //static
  A(){}
  public void show(int a,int b)  //non static   //10,20
  {
   A a2= new A();  //object 2 a2                                 instance a  ,   static common for class :::::b
    this.a=a;    //point to reference where the first object is created //a1     a1.a=10;
    this.b=b;    //common for all because b is static A.b //this.b//a1.b//a2.b  :::::::::::20  
   System.out.println(a2.a);
   System.out.println(a2.b);
  }

}

public class Object_u{
    public static void main(String[] args) {
        A a1=new A();   //object 1//a1
        a1.show(10, 20);

        System.out.println(a1.a);
        System.out.println(a1.b);
        
       

    }
}
