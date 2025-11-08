import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        String str[] = {"apple", "banana", "avocado", "grape", "apricot"};
        List<String>ls=Arrays.asList(str);
        List<String>res=ls.stream().filter(i->i.length()>5).collect(Collectors.toList());
        System.out.println(res);
        long count= ls.stream().filter(i->i.length()>5).count();
        System.out.println(count);
    }
}
