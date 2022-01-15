package FunctionalProgramming;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;

public class InterfacesTests {
    public static void main(String[] args){

        Employee mike = new Employee("Mike",2000,Employee.Gender.Male),
                rose = new Employee("Rose",2500,Employee.Gender.Female);

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

        //Simple lambda comparator
        Comparator<Employee> byNameLambda1 =
                (Employee a,Employee b) -> {return  a.getName().compareTo(b.getName());};

        //Removing parameter types
        Comparator<Employee> byNameLambda2 =
                (a,b) -> {return a.getName().compareTo(b.getName());};

        //Remove return and braces
        //Because it contain only one statement and is return
        Comparator<Employee> byNameLambda3 =
                (a,b) -> a.getName().compareTo(b.getName());

        //Use reference to specified object
        Employee frank = new Employee("Frank",3000,Employee.Gender.Male);
        Supplier<Integer> salarySupplier = frank::getSalary;

        System.out.println(salarySupplier.get());


        Function<Employee,Integer> salaryFunction = Employee::getSalary;
        System.out.println(salaryFunction.apply(new Employee("sam",800,Employee.Gender.Male)));

        //Build comparator using method refrence -> because getName return String which han natural ordering it can be us
        Comparator<Employee> byNameMethod = Comparator.comparing(Employee::getName);






    }

}

