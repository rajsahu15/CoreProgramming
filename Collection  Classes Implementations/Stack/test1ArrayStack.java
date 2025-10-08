public class test1ArrayStack {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();
        System.out.println("Is stack empty? " + stack.isEmpty());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack size: " + stack.size());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack size after pop: " + stack.size());
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
