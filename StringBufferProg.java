public class StringBufferProg{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append("World");
        System.out.println("StringBuffer after append: " + sb.toString());

        sb.insert(5, ",");
        System.out.println("StringBuffer after insert: " + sb.toString());

        sb.replace(0, 5, "Hi");
        System.out.println("StringBuffer after replace: " + sb.toString());

        sb.delete(2, 4);
        System.out.println("StringBuffer after delete: " + sb.toString());

        sb.reverse();
        System.out.println("StringBuffer after reverse: " + sb.toString());
    }
}