class Person {
    String name;
    public Person(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Person's name is: " + name;
    }
}
public class toString {
    public static void main(String[] args) {
        System.out.println(new Person("Alice"));
    }
}
