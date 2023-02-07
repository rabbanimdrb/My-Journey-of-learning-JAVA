package CollectionsFrameworks.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayList {
    public static void main(String[] args) {
        List<String> topProgrammingLanguages = new ArrayList<>();

        // Check if the ArrayList is empty
        System.out.println(topProgrammingLanguages.isEmpty());

        topProgrammingLanguages.add("Java");
        topProgrammingLanguages.add("C++");
        topProgrammingLanguages.add("Python");
        System.out.println(topProgrammingLanguages);

        // Check the size of the ArrayList 
        System.out.println(topProgrammingLanguages.size());

        // Retrive the element at a given index
        String bestProgramminLanguage = topProgrammingLanguages.get(0);
        System.out.println(bestProgramminLanguage);

        // Modify the element at a given index 
        topProgrammingLanguages.set(1, "Go Lang");
        System.out.println(topProgrammingLanguages);
    }
}
