package CollectionsFrameworks.List.ArrayList;

import java.util.*;

public class SortList {

    public static void main(String[] args) {

//      Create List
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(10);
        list.add(40);
        list.add(50);
        list.add(30);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list); //sorting in ascending order

        Collections.reverse(list); //sorting in descending order
        System.out.println(list);

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(1,"Deepjoti",24,18000));
        employees.add(new Employee(2,"Praneet", 29, 48000));
        employees.add(new Employee(3, "Ravi", 32, 35000));
        employees.add(new Employee(4, "Javed", 31, 60000));

        Collections.sort(employees, new MySort()); //Sort in ascending order
        System.out.println(employees);

//        Comparator using anonymous implementation
        Collections.sort(employees, new Comparator<Employee>(){

            @Override
            public int compare(Employee o1, Employee o2) {
                return (int)(o1.getSalary() - o2.getSalary()); //Sort in ascending order
            }
        });

//        Comparator using lambda implementation
        Collections.sort(employees,(o1, o2) -> (int)(o1.getSalary() - o2.getSalary()));

        System.out.println(employees);
    }
}

class MySort implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return (int)(o1.getSalary() - o2.getSalary()); //Sort in ascending order
//        return (int)(o1.getSalary() - o2.getSalary()); //Sort in descending order
    }
}
