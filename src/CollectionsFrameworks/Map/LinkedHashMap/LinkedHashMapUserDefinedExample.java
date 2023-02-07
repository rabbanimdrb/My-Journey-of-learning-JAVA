package CollectionsFrameworks.Map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapUserDefinedExample {
    public static void main(String[] args) {
//        Create LinkedHashMap
        Map<Integer, Student> studentMap = new LinkedHashMap<>();

        studentMap.put(1, new Student("Tony", "Pratap"));
        studentMap.put(2,new Student("Spider", "Man"));
        studentMap.put(3, new Student("Shakti", "Maan"));

        System.out.println(studentMap);

//        Iterating over LinkedHashMap
        for(Map.Entry<Integer, Student> entry : studentMap.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
