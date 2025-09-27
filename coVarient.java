class Animal
{ 
    String Name;
    public static Animal walk(String Name)
    {
     return new Animal();    
    }
}
class Bird extends Animal
{
    public static Bird walk(String Name)
    {
     return new Bird();    
    }
}

public class coVarient {
    public static void main(String[] args) {
        Animal a = new Bird();
        Bird b = (Bird) a; // Downcasting
        System.out.println("Downcasting successful: " + (b instanceof Bird));
        
        Animal animal = Animal.walk("Dog");
        Bird bird = Bird.walk("Sparrow");
        
        System.out.println("Animal instance created: " + (animal instanceof Animal));
        System.out.println("Bird instance created: " + (bird instanceof Bird));
    }
}
