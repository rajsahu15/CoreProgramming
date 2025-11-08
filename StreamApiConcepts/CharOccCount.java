
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CharOccCount {
    public static void main(String[] args) {
        String s = "abshabas";

        Map<Character, Long> m = s.chars().mapToObj(i->(char)i).collect(
                Collectors.groupingBy(i -> i, () -> new LinkedHashMap<Character, Long>(), Collectors.counting()));
                m.forEach((a,b)->System.out.println(a+" ="+b));
                

    }
}

