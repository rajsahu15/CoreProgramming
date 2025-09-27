class Address implements Cloneable {
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
        Person person=(Person) super.clone();
        person.address=(Address)address.clone();
        return person;
    }

    @Override
    public String toString() {
        return "Person: " + name + ", Age: " + age + ", City: " + address.city;
    }

}

public class DeepClone {
    public static void main(String[] args)throws CloneNotSupportedException {
        Person p1 = new Person("Ram", 1, new Address("Bhopal"));
        Person p2 = (Person) p1.clone();

        p2.address.city = "Gadarwara";
        System.out.println(p2);
        System.out.println(p1);
    }
}
