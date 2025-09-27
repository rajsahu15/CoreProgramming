class ShiftOp
{
public static void main(String[] args) {
    int a = 8; // 1000 in binary
    int leftShift = a << 2; // Shift left by 2 bits
    int rightShift = a >> 2; // Shift right by 2 bits

    System.out.println("Original: " + a);
    System.out.println("Left Shift (<<): " + leftShift); // Should print 32 (100000)
    System.out.println("Right Shift (>>): " + rightShift); // Should print 2 (10)
}
}
