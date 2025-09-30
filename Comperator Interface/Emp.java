public class Emp{
    final int id;
    static int x = 100;
    String name;
    int age;

    Emp(String name, int age) {
        id = x++;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Emp [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
    }
