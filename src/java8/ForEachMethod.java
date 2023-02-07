package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachMethod {
//    Why do we need for each method :

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,5,6,7,9,1);

//        For Loop
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i) + " ");
//        }

//        Enhanced for loop
//        for (int element : list){
//            System.out.print(element  + " " );
//        }

//        For Each Method
        list.forEach(element -> System.out.print(element  + " "));

//        Consumer<Integer> cons = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        };
//        list.forEach(cons);
    }
}

