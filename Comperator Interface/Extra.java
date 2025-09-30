import java.util.Comparator;

public class Extra implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
         /* 
                   comparision based on name 
                   return (((Emp)o1).name).compareTo(((Emp)o2).name);
                   
                   comparision based on age
                   return ((Emp)o1).age - ((Emp)o2).age;

                   compare based on name length
                   
         */
              return (((Emp)o1).name).length()-(((Emp)o2).name).length();    
       
         }

}
