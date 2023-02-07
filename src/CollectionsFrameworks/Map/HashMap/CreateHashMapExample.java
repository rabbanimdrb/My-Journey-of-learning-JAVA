package CollectionsFrameworks.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class CreateHashMapExample {
    public static void main(String[] args) {

//        Example to map numbers to string
        Map<String, Integer> numberMapping = new HashMap<>();

//        Add key-value to map
        numberMapping.put("One", 1);
        numberMapping.put("Two", 2);
        numberMapping.put("Three",3);
        numberMapping.put("Four",4);
        numberMapping.put("Five",5);

        numberMapping.put(null, 6);
        numberMapping.put(null,7);

        System.out.println(numberMapping);                      //          prints HashMap
        System.out.println(numberMapping.keySet());             //          prints only the key sets
        System.out.println(numberMapping.values());             //          prints only the values
        System.out.println(numberMapping.isEmpty());            //          isEmpty()
        System.out.println(numberMapping.size());               //          size()
        System.out.println(numberMapping.get("Three"));         //          get(key)
        System.out.println(numberMapping.containsKey("Two"));   //          containsKey(key)
        System.out.println(numberMapping.containsValue(2));     //          containsValue(value)
        System.out.println(numberMapping.remove("One"));    //          remove(key)

        numberMapping.forEach((x,y) -> System.out.println(x + " " +  y));
    }
}
