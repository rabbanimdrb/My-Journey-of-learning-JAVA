package CollectionsFrameworks.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapUserDefinedExample {
    public static void main(String[] args) {
//        Create HashMap
        Map<Integer, Student> studentMap = new HashMap<>();

        studentMap.put(1, new Student("Tony", "Pratap"));
        studentMap.put(2,new Student("Spider", "Man"));
        studentMap.put(3, new Student("Shakti", "Maan"));

        System.out.println(studentMap);

    }
}
