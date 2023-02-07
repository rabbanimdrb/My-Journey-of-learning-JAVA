package CollectionsFrameworks.List.ArrayList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DifferentWaysToIterateOverArrayList {
    public static void main(String[] args) {

        List<String> courses = Arrays.asList("C", "C++", "Java", "Spring", "Hibernate");
//        System.out.println(courses);

//        Basic using for LOOP
        for (int i = 0; i < courses.size(); i++) {
//            System.out.print(courses.get(i) + " ");
        }

//        Using Enhanced For LOOP
        for (String course : courses) {
//            System.out.print(course + " ");
        }

//        Basic Loop with Iterator :: Not Clear
        for(Iterator iterator = courses.iterator(); iterator.hasNext();){
            String course = (String) iterator.next();
            System.out.println(course);
        }

//        Iterator with while LOOP :: Not Clear
        Iterator iterator = courses.iterator();
        while (iterator.hasNext()){
            String course = (String) iterator.next();
            System.out.println(course);
        }


//          :: After JAVA 8
//        Using ForEach + Lambda Expression
        courses.forEach(course -> System.out.println(course));

//        Using stream() +  forEach() + Lambda Expression
        courses.stream().forEach(course -> System.out.println(course));
    }
}
