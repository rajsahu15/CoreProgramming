 import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class passwordMatcher {

    public static void main(String[] args) {
        String passwordRegex = "(?=.[a-z])(?=.[A-Z])(?=.*[^a-zA-Z0-9]).{4,8}$";
        String password = "aPss@1";

        Pattern pattern = Pattern.compile(passwordRegex);
        Matcher matcher = pattern.matcher(password);

        if (matcher.matches()) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }
}

