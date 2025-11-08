import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordOccCount {
    public static void main(String[] args) {
        String s="Java is very very easy Java";
        String str[]=s.split(" ");
        List<String>ls=Arrays.asList(str);
        
        Map<String,Long> m=ls.stream().collect(Collectors.groupingBy
                                                           (i->i,()->new LinkedHashMap<String,Long>(),Collectors.counting())
                                                           );
                                                           
        m.forEach((a,b)->System.out.println(a+" ="+b));                                                    
         
    }
}
