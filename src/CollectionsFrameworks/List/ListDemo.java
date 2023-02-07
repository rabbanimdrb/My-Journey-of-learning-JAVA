package CollectionsFrameworks.List;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // List allows us to add duplicate elements
        list.add("First");
        list.add("Second");
        list.add("First");
        list.add("Second");
        System.out.println(list);

        // List allow you to add 'null' elements
        list.add(null);
        list.add(null);
        System.out.println(list);

        // Insertion Order
        list.add("1"); //0
        list.add("2"); //1
        list.add("3"); //2
        System.out.println(list);

        // accessing elements from list 
        System.out.println(list.get(0));
        System.out.println(list.get(2));
    }
    
}
