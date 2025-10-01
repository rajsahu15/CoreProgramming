
import java.util.Comparator;
import java.util.TreeMap;

class NewComporator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        String s1=o1.toString();
        String s2=o2.toString();
        return s1.compareTo(s2) ;
    }
}


public class SortedMaPProg {
    public static void main(String[] args) {
     
      TreeMap m=new TreeMap(new NewComporator());
        m.put("abcd","Zdjvwdj");
        m.put("dsjjbskd","Adkk");
        m.put("dskbjaa","Mdbsb");
        m.put("sdkkbsk","Kdjvu");
        m.put(102,101);
        m.put(103,101);
        m.put(101,101);
     
        
        
        System.out.println(m);
    }
}
