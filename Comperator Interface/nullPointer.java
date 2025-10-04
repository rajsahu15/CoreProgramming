class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}


public class nullPointer {
 public static void main(String[] args) {
    Person person = null;

    try {
        System.out.println("Name: " + person.name);
    } catch (NullPointerException e) {
        System.out.println("Caught a NullPointerException: " + e.getMessage());
    }
 }   
}
