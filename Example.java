
/*
 * Method overriding in Java is a feature that allows a subclass (child class) to provide a specific implementation of a method that is
 *  already defined in its superclass (parent class).
 *  
 * 
 * 
 * 
 * 
 * ----1----also known as runtime polymorphism or dynamic binding
 * ----2----same method name and same parameters (argument) in both super class and subclass
 * ----3----inheritance must be there
 * ----4----wider access modifier in subclass only allowed
 * ----5----static and final methods cannot be overridden
 * ----6----private methods cannot be overridden
 * ----7----
 * ----8----
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

class MethodParent {
    public void Rashmi() {
        System.out.println(" Rashmi method of Parent class");
    }
}

class MehtodOverriding extends MethodParent {
   @Override
    public void Rashmi() {
        System.out.println(" Rashmi method of Child class");
    }

}
public class Example
{
    public static void main(String[] args) {
    MehtodOverriding obj=new MehtodOverriding();
    obj.Rashmi();   
    }
} 

