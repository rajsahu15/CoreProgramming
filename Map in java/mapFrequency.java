import java.util.HashMap;

public class mapFrequency {
  public static void main(String[] args) {
    String str = "abbcccddddeeeee";
   HashMap<Character, Integer> map = new HashMap<>();

    for (char ch : str.toCharArray()) {
      if(map.containsKey(ch)) {
        map.put(ch, map.get(ch) + 1);
      } else {
        map.put(ch, 1);
      }
    }

    for (char ch : map.keySet()) {
      System.out.println(ch + ": " + map.get(ch));
    }
  }  
}
