public class Emp implements Comparable {
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

    public int compareTo(Object o) {
        // 1.basis of name comparision
        // return name.compareTo(((Emp)o).name);
        // 2.basis of age comparision
        // return age-(((Emp)o).age);

        //basis of name length comparision


        //this is know as natural ordering the implementation of comparable
        return name.length()-((Emp)o).name.length();

    }

}
