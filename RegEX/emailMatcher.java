
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class emailMatcher
{
   public static void main(String[] args) {
        String exp = "^[a-zA-Z0-9]+@(gmail|email|yahoo)\\.com$";
        String s = "jap121@gmail.com";
        Pattern p = Pattern.compile(exp);
        Matcher m = p.matcher(s);

        if (m.matches())
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
}