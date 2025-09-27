import java.util.*;

class Pojo {
    int id;
    String name;
    int marks;

    public Pojo(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Pojo{id=" + id + ", name='" + name + "', marks=" + marks + "}";
    }
}

public class Bean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // initialize users
        List<Pojo> users = initUser();

        // Print initialized users
        System.out.println("Initial Users:");
        for (Pojo p : users) {
            System.out.println(p);
        }

        // Example: Add a new user from input
        System.out.print("\nEnter id: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        users.add(new Pojo(id, name, marks));

        System.out.println("\nUpdated Users:");
        for (Pojo p : users) {
            System.out.println(p);
        }
    }

    public static List<Pojo> initUser() {
        List<Pojo> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(new Pojo(i, "User" + i, i * 10)); // default names and marks
        }
        return list;
    }
}
