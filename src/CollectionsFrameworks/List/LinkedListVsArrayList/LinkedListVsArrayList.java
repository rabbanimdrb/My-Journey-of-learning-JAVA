package CollectionsFrameworks.List.LinkedListVsArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListVsArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        final long startTimeLL = System.nanoTime();
        linkedList.remove(1);
        final long endTimeLL = System.nanoTime();

        final long startTimeAL = System.nanoTime();  //System.nanoTime() :: Returns the current value of the running Java Virtual Machine's high-resolution time source, in nanoseconds.
        arrayList.remove(1);
        final long endTimeAL = System.nanoTime();

        long totalTimeLL = endTimeLL - startTimeLL;
        long totalTimeAL = endTimeAL - startTimeAL;

        System.out.println("Total LinkedList execution time: " + totalTimeLL);
        System.out.println("Total Array List execution time: " + totalTimeAL);
    }
}
