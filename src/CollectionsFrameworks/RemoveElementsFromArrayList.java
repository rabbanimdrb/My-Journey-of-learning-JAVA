package CollectionsFrameworks;

import java.util.ArrayList;
import java.util.List;

// remove()
// removeall()
// clear()
public class RemoveElementsFromArrayList {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Pineapple");
        fruits.add("Grapes");
        System.out.println(fruits);
        
        fruits.remove("Apple");
        System.out.println("After removing fruits 'Apple' => " + fruits);

        fruits.remove(0);
        System.out.println("After removing fruits at index '0'=> " + fruits);


        List<String> subFruitsList = new ArrayList<>();
        subFruitsList.add("Apple");
        subFruitsList.add("Banana");

        fruits.removeAll(subFruitsList);
        System.out.println(fruits);

        fruits.clear();
        System.out.println(fruits);

    }   
}