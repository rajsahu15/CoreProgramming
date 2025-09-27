class Animal
{
    public void eat()
    {
        System.out.println("Animal is eating");
    }
    public void sleep()
    {
        System.out.println("Animal is sleeping");
    }
}
class Dog extends Animal
{
    @Override
    public void eat()
    {
        System.out.println("Dog is eating");
    }
    public void bark()
    {
        System.out.println("Dog is barking");
    }
}
public class looseCoupling
{
    public static void main(String[] args) {
        Animal a=new Dog();  //upcasting
        a.eat();  //Dog class eat method will be called
        a.sleep(); //Animal class sleep method will be called
        //a.bark();  //CTE  (bark method is not present in Animal class)
    }
}