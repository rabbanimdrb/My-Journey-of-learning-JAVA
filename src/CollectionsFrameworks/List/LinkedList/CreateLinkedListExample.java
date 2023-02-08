package CollectionsFrameworks.List.LinkedList;

import java.util.LinkedList;

public class CreateLinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Guava");
        fruits.add("Guava");
        fruits.add("Grapes");
        fruits.add("Avocado");
        System.out.println(fruits);

//        Add elements in LinkedList
        fruits.add(2, "Watermelon");
        fruits.addFirst("Orange");
        fruits.addLast("Strawberry");
        System.out.println(fruits);

//        Retrieve LinkedList elements
        System.out.println(fruits.getFirst());
        System.out.println(fruits.getLast());
        System.out.println(fruits.get(2));

        fruits.forEach(n -> System.out.print(n + " "));

//        Delete elements from LinkedList
        System.out.println(fruits.removeFirst());
        System.out.println(fruits.removeLast());
        System.out.println(fruits.remove(2));
        fruits.remove("Banana");
        System.out.println(fruits);
        System.out.println(fruits.contains("Mango"));
//        fruits.clear();
        System.out.println(fruits);
        System.out.println("fruits.indexOf \"Avocado\": " + fruits.indexOf("Avocado"));
        System.out.println("fruits.lastIndexOf \"Guava\": " + fruits.lastIndexOf("Guava"));

        fruits.forEach(n -> System.out.println(n));

        fruits.stream().forEach(n -> System.out.println(n));

    }
}