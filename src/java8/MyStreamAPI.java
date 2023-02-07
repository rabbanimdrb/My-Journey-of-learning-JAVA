package java8;

import com.sun.jdi.request.InvalidRequestStateException;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MyStreamAPI {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4, 5, 7, 3, 2, 6);

//        int sum = 0;
//        for (int n : numbers) {
//            if (n % 2 == 0) {
//                n = n * 2;
//                sum = sum + n;
//            }
//        }
//        System.out.println(numbers);
//        System.out.println(sum);

        numbers.forEach(n -> System.out.print(n + " "));
        System.out.println();

//        Stream<Integer> s1  = numbers.stream();
//        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
//        Stream<Integer> s3 = s2.map(n -> n*2);
//        int result = s3.reduce(0, (c, e) -> (c+e));

        int result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n*2)
                .reduce(0, (c, e) -> (c + e));

//        s1.forEach(n -> System.out.print(n + " "));
//        s3.forEach(n -> System.out.print(n + " "));
        System.out.println(result);
    }
}
