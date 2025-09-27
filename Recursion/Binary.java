public class Binary {

    public static void main(String[] args) {
        int n = 10;
        System.out.print("The binary representation of " + n + " is: ");
        
        if (n == 0) {
            System.out.print(0);
        } else {
            toBinaryRecursive(n);
        }
        System.out.println();
    }

    public static void toBinaryRecursive(int n) {
        if (n == 0) {
            return;
        }
        
        toBinaryRecursive(n/2);
        
        System.out.print(n%2);
    }
}