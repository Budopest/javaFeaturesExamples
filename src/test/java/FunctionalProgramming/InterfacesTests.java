package FunctionalProgramming;

import java.util.Comparator;

public class InterfacesTests {
    public static void main(String[] args){

        Employee mike = new Employee("Mike",2000),
                rose = new Employee("Rose",2500);

        //Old Way Using Anonymous class
        Comparator<Employee> byName = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        System.out.println("BY Name:");
        System.out.println(byName.compare(mike,rose));

        //Cannot compare to null
        try {
            System.out.println(byName.compare(mike,null));
        }
        catch (NullPointerException e){
            System.out.println(e);
        }

        //nullLast is a static method in the Comparator Interface
        Comparator<Employee> byNameThenNull = Comparator.nullsLast(byName);
        System.out.println(byNameThenNull.compare(mike,rose));
        System.out.println(byNameThenNull.compare(mike,null));

        //reversed is a default method in Comparator Interface
        Comparator<Employee> nullThenDecreasingName = byNameThenNull.reversed();
        System.out.println(nullThenDecreasingName.compare(mike,rose));
        System.out.println(nullThenDecreasingName.compare(mike,null));







    }

}

