public class Max2And2Min {
    public static void main(String[] args) {
        int a[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int max = Integer.MIN_VALUE;
        int max2 = max;

        int min = Integer.MAX_VALUE;
        int min2 = min;

        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < a[i].length; j++) {
                int currentElement = a[i][j];
                if (currentElement > max) {
                    max2 = max;
                    max = currentElement;
                } 
                else if (currentElement > max2 && max != currentElement)
                    max2 = currentElement;
                if (currentElement < min) {
                    min2 = min;
                    min = currentElement;
                }
                else if (currentElement < min2 && min != currentElement)
                    min2 = currentElement;

            }
        }
        System.out.println("Arrays 2ndMaxElement: " + max2);
        System.out.println("Arrays 2ndMinElement: " + min2);

    }
}
