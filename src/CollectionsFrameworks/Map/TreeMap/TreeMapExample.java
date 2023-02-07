package CollectionsFrameworks.Map.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
//        Create a TreeMap
        TreeMap<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Three",3);
        treeMap.put("Four",4);
        treeMap.put("Five",5);

        System.out.println(treeMap);

//        Iterating over a TreeMap Collection
        for(Map.Entry<String, Integer> entry1 : treeMap.entrySet()){
            System.out.println(entry1.getKey());
            System.out.println(entry1.getValue());
        }

    }
}
