class Address {
    String city;

    public Address(String city) {
        this.city = city;
    }
      @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Person implements Cloneable {
    String name;
    int age;
    Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person: " + name + ", Age: " + age + ", City: " + address.city;
    }

}

public class ShallowClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("Ram", 1, new Address("Bhopal"));
        Person p2 = (Person) p1.clone();

        p2.address.city = "MP";
        System.out.println(p2);
        System.out.println(p1);

    }
}