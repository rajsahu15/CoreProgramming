import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int intValue = sc.nextInt();

        System.out.print("Enter a byte value: ");
        byte byteValue = sc.nextByte();

        System.out.print("Enter a short value: ");
        short shortValue = sc.nextShort();

        System.out.print("Enter a long value: ");
        long longValue = sc.nextLong();

        System.out.print("Enter a float value: ");
        float floatValue = sc.nextFloat();

        System.out.print("Enter a double value: ");
        double doubleValue = sc.nextDouble();

        System.out.print("Enter a boolean value (true/false): ");
        boolean booleanValue = sc.nextBoolean();

        System.out.println("\nYou entered:");
        System.out.println("Integer: " + intValue);
        System.out.println("Byte: " + byteValue);
        System.out.println("Short: " + shortValue);
        System.out.println("Long: " + longValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Boolean: " + booleanValue);
    }
}
