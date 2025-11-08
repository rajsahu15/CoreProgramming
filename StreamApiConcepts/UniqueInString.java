import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueInString {
    public static void main(String[] args) {
        String s="My Name Is Raj Is My Name";
        String str[]=s.split(" ");
          
        List<String>ls=Arrays.asList(str);
        List<String>result=ls.stream().distinct().collect(Collectors.toList());
        System.out.println(result);
    }
}
