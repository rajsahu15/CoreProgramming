import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class firstCapWCap {
    public static void main(String[] args) {
 
        String str[] = {"Apple", "banana", "Avocado", "grape", "apricot"};
        List<String>ls=Arrays.asList(str);
        List<String>res=ls.stream().filter(i->i.startsWith("A")).map(i->i.toUpperCase()).collect(Collectors.toList());
        System.out.println(res);
       
    }
}

