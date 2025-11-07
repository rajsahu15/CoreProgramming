import java.util.function.Function;
import java.util.function.Predicate;

public class predicateEx {
    public static void main(String[] args) {
        String str[] = { "Ram", "Raj", "RamRajya" };
        Predicate<String>p=i->i.length()<=3;
        Function<String,String>f=i->i.toUpperCase();
        
        for(String s:str){
            if(p.test(s)){
                System.out.println(f.apply(s));
            }
        }
        
    }
}
