import java.util.Arrays;

class Circle implements Comparable<Circle> { // FIX 1: Implement Comparable
    int radius;

    Circle(int r) {
        radius = r;
    }

    @Override
    public String toString() {
        return "Circle with radius: " + radius;
    }

    @Override
    public int compareTo(Circle other) { // FIX 2: Implement compareTo()
        // Sorts in ascending order of radius
        return this.radius - other.radius;
        // return Integer.compare(this.radius, other.radius); // Recommended in modern
        // Java
    }
}

public class chatGpt {
    public static void main(String[] args) {
        Circle[] circles = { new Circle(5), new Circle(2), new Circle(8) };
        Arrays.sort(circles); // Will now work!
        for (Circle c : circles) {
            System.out.println(c);
        }
    }
}
