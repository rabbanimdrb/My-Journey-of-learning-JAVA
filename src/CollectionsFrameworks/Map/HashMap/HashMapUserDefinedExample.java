package CollectionsFrameworks.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapUserDefinedExample {
    public static void main(String[] args) {
//        Create HashMap
        Map<Integer, Student> studentMap = new HashMap<>();

        studentMap.put(1, new Student("Tony", "Pratap"));
        studentMap.put(2,new Student("Spider", "Man"));
        studentMap.put(3, new Student("Shakti", "Maan"));

        System.out.println(studentMap);  //prints all the key & map in "studentMap"

//        Iterating over a HashMap Collection
        for(Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
