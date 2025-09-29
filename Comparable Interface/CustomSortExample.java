import java.util.Arrays;

// Use the generic form of Comparable for type safety
class Circle implements Comparable<Circle> { 
    int radius;

    Circle(int r) {
        radius = r;
    }
    @Override
    public int compareTo(Circle other) {
        // Compares the radii for ascending order
        return this.radius - other.radius; 
    }
    
    @Override
    public String toString() {
        return "Circle with radius: " + radius;
    }
}

public class CustomSortExample { 
     public static void sort(Object[] o) { 
        for (int i = 0; i < o.length; i++) {
            for (int j = 0; j < o.length - 1 - i; j++) {
                Circle c1 = (Circle)o[j];
                Circle c2 = (Circle)o[j + 1];
                
                if (c1.radius > c2.radius) { 
                 Circle temp = (Circle)o[j]; 
                    o[j] = o[j + 1];
                    o[j + 1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Circle[] circles = { new Circle(5), new Circle(2), new Circle(8) };
        
        System.out.println("Before sorting: " + Arrays.toString(circles));

        // 4. Call the custom sort method
        sort(circles); 

        System.out.println("After sorting:  " + Arrays.toString(circles));
    }
}