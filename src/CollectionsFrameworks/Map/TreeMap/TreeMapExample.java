package CollectionsFrameworks.Map.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
//        Create a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

//        TreeMap sorts according to the key values in ascending order
        treeMap.put(5, "Five");
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(4, "Four");

        System.out.println(treeMap);

//        Iterating over a TreeMap Collection
        for(Map.Entry<Integer, String > entry1 : treeMap.entrySet()){
            System.out.println(entry1.getKey());
            System.out.println(entry1.getValue());
        }

    }
}
