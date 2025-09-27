
import java.util.regex.*;

public class RegEx {

    public static void main(String[] args) {
        
    String expression="[0-9]";
    String str="B3AbBCa5bBa1b20";   
    int sum=0;
    Pattern p= Pattern.compile(expression);
    Matcher m= p.matcher(str);

     while(m.find())
     {
        sum=sum+Integer.parseInt(m.group());
       
     }
     System.out.println(sum);
    }
    
}






// regular exprression

// it is used for validation purpose and can be performed in a string
// it is client side validation process

// 1. Pattern
// import java.util.regex.Pattern;

/*
 * public static Pattern compile(String s)
 * {
 * return"";
 * }
 * 
 * public Matcher matcher (String s)
 * {
 * return new Matcher();
 * }
 * 
 */

// 2. Matcher
// import java.util.regex.Matcher;

/*
 * public String group()
 * {
 * return "";
 * }
 * 
 * public boolean find()
 * {
 * return true;
 * }
 * 
 */

