package CollectionsFrameworks.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListFromCollectionExample {
    public static void main(String[] args) {
        List<Integer> firstFivePrimeNumbers = new ArrayList<>();

        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);
        System.out.println(firstFivePrimeNumbers);

        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers); 
        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);

        firstTenPrimeNumbers.addAll(nextFivePrimeNumbers); //Added all the elements in the list "nextFivePrimeNumbers" to "firstTenPrimeNumbers"

        System.out.println(firstTenPrimeNumbers);
    }
}
