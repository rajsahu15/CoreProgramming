import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example1{
    public static void main(String[] args) {
        
        List<Integer>ls=Arrays.asList(10,2,3,10,3,4,5);
        List<Integer>result=ls.stream().filter(i->i%2==0).sorted().collect(Collectors.toList());
        System.out.println(result);
    }
}
//Stream interface is used to process collections of objects. A stream is a sequence of objects that supports
// various methods which can be pipelined to produce the desired result.

//methods of Stream interface:
//1. filter(Predicate p): This method is used to select elements based on a condition.
//2. map(Function f): This method is used to transform each element in the stream.
//3. collect(Collector c): This method is used to collect the elements of the stream
//   into a collection like List, Set, etc.
//In the above example, we have used the filter method to select even numbers from the list.