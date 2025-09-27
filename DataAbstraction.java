abstract class Room1 {
    // abstract methods defination
    // syntax to create method
    // access modifier(not mandatory) non access modifier(not mandatory) return type
    // method name (){ }
    public abstract void Show(); 
    // incomplete method //and abstract method
    // methods which have body are concrete methods

}

class Room2 extends Room1 {
    @Override
    public void Show() {

        System.out.println(" OF ABSTRACT Show()METHOD IMPLEMENTATION of super class");
    }
}

public class DataAbstraction {
    public static void main(String[] args) {
        // Abs1 a=new Abs1() ;//obj create of abstract class
        Room1 key = new Room2();//upcasting
        key.Show();
        Room2 key2=(Room2)key;  //downcasting

    }

}

/*
 * Data Abstraction
 * 
 * To hide the implementations and only showing the working or Ui to people
 * Data Abstraction is the process of hiding internal details (implementation)
 * and showing only essential features to the user
 * 
 * we can achieve it by two ways
 * 1----Abstract class(not 100% sure to achieve)
 * 2----Interface (100 %sure)
 * 
 * Abstract Class
 * 1----Its a class declared using abstract keyword
 * 2----if a class contains abstract methods then its a abstract class
 * 3----we can also create non abstract methods (concrete methods)
 * 4----Abstract Methods-----they do not have implementation in abstract class
 * 5-----We cannot create the object of abstract class
 * 6-----we can create constructor and blocks inside abstract class
 * 7-----to get the details or implementation of abstract class we have to
 * extend it compulsory
 * 8-----In the subclass where we are extending abstract class we have to
 * compulsory make the body of abstract method
 * 9-----if in the subclass if we donot make the body of abstract method then we
 * have to make the subclass also abstract
 * 10-----abstract keyword can be used for abstract method and to make class
 * abstract
 * 11-----abstract method only we can make inside abstract class
 */
