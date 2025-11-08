import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class OccOfNo {
    public static void main(String[] args) {
        
        int arr[]={10,2,3,4,5,2,1,2,3,4};
        Map<Integer,Long>ls=Arrays.stream(arr).mapToObj(i->i).collect(Collectors.groupingBy
                                                    (i->i,()->new LinkedHashMap<Integer,Long>(),Collectors.counting()));
     
        ls.forEach((a,b)->System.out.println(a+"=\t"+b));
                                               }
}
