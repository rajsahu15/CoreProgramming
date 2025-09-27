public class StringBuilderProg {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("World");
        System.out.println("StringBuilder after append: " + sb.toString());

        sb.insert(5, ",");
        System.out.println("StringBuilder after insert: " + sb.toString());

        sb.replace(0, 5, "Hi");
        System.out.println("StringBuilder after replace: " + sb.toString());

        sb.delete(2, 4);
        System.out.println("StringBuilder after delete: " + sb.toString());

        sb.reverse();
        System.out.println("StringBuilder after reverse: " + sb.toString());
    }
}
