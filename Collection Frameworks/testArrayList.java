//based on the index it store the value
//it is a dynamic array
//it can contain duplicate values
//it maintains the insertion order    


import java.util.ArrayList;

public class testArrayList {
    public static void main(String[] args) {

      ArrayList<String> list = new ArrayList<String>();
      ArrayList<String> list2 = new ArrayList<>();
        list.add("Hello");  
        list.add("World");
        list.add("New Program");
        System.out.println(list);
        list2.addAll(list);

        
        list.remove(1);
        System.out.println(list);

        list.set(1, "Java Program");
        System.out.println(list);

        System.out.println("Element at index 0: " + list.get(0));
        System.out.println("Size of the list: " + list.size());
        System.out.println("Is the list empty? " + list.isEmpty());

        list.clear();
        System.out.println("List after clear operation: " + list);

        list.addAll(list2);
        System.out.println("List after adding all elements from List2: " + list);
        
        System.out.println("Does the list contain 'Hello'? " + list.contains("Hello"));
        System.out.println("Index of 'Java Program': " + list.indexOf("Java Program"));

        list2.add("jaiho");
        list2.add("jaihoooo");
        list2.add("jaihooiiiii");
        
        System.out.println("List2: " + list2);
        
        list2.removeAll(list);
        System.out.println("List2 after removing all elements from List: " + list2);
        System.out.println(list);
        list.add("jaiho");
        System.out.println(list);
        list2.retainAll(list);
        System.out.println("List2 after retaining only elements present in List: " + list2);
    }
}
