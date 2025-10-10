
import java.util.Stack;

//balanced string {[()]}
//using stack
public class balancedString {
    public static void main(String[] args) {
        String s = "{[(ram)}}}";

        if (isBalanced(s)) {
            System.out.println("Balanced String");
        } else {
            System.out.println("Not a Balanced String");
        }

    }
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else if (ch == '}' || ch == ']' || ch == ')') {
                if (stack.isEmpty()) {
                    return false; // Unmatched closing bracket
                }
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false; // Mismatched pair
                }
            }
        }
        return stack.isEmpty(); // If stack is empty, all brackets were matched
    }
    public static boolean isMatchingPair(char open, char close) {
        return (open == '{' && close == '}') ||
               (open == '[' && close == ']') ||
               (open == '(' && close == ')');
    }
}
