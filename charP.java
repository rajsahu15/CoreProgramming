
import java.util.Map;


public class charP {
 public static void main(String[] args) {

     String str="HELLO WORLD IS THIS MY MPR";
          int count=0;
          Map<Character, Integer> map = new java.util.HashMap<>();
          
            for(char a:str.toCharArray())
            {
              if(a == ' ') // Skip spaces
                continue;
                if(map.containsKey(a))
                {
                    map.put(a, map.get(a)+1);
                }
                else
                {
                    map.put(a, 1);
                }
            }

              System.out.println(map);

 }
}
