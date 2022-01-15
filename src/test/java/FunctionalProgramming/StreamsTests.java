package FunctionalProgramming;

import java.util.*;
import java.util.stream.Stream;

public class StreamsTests {
    public static void main(String[] args) {

        Employee mike = new Employee("Mikel",2000, Employee.Gender.Male),
                rose = new Employee("Rose",2500, Employee.Gender.Female),
                anna = new Employee("Anna",3000,Employee.Gender.Female),
                dan = new Employee("Dan",1500,Employee.Gender.Male),
                andy = new Employee("Andy",4000,Employee.Gender.Male),
                josh = new Employee("Josh",500,Employee.Gender.Male),
                josh2 = new Employee("Josh",800,Employee.Gender.Male),
                liz = new Employee("Liz",3700,Employee.Gender.Female),
                emma = new Employee("Emma",1200,Employee.Gender.Female);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(mike);
        employeeList.add(rose);
        employeeList.add(anna);
        employeeList.add(dan);
        employeeList.add(andy);
        employeeList.add(josh);
        employeeList.add(josh2);
        employeeList.add(liz);
        employeeList.add(emma);


        //Print using enhance for loop and the list
        for(Employee e: employeeList)
            System.out.println(e);

        Iterator<Employee> employeeIterator = employeeList.iterator();
        while(employeeIterator.hasNext()) System.out.println(employeeIterator.next());

        //internal iteration -> no variable refers to the element
        Stream<Employee> employeeStream = employeeList.stream();
        employeeStream.forEach(System.out::println);


        //print names of employees with salary at least 2500 and alphabetically sorted
        employeeList.stream().filter(e -> e.getSalary() >= 2500)
                .map(Employee::getName)
                .sorted()
                .forEach(System.out::println);

        System.out.println("--------------------------------------------------------");

        //Get distinct male employees names with salary less than 1500
        employeeList.stream().filter(e-> e.getGender() == Employee.Gender.Male)
                .filter(e -> e.getSalary() < 1500)
                .map(Employee::getName)
                .distinct() //Uses equals so for object you will need to override hashcode and equals
                .forEach(System.out::println);

        //Get highest pay female employee
        employeeList.stream().filter(e -> e.getGender() == Employee.Gender.Female)
                .sorted(Comparator.comparing(Employee::getName))
                .limit(1)
                .forEach(System.out::println);

        //Get 10 random positive distinct integers
        final Random random = new Random();
        Stream<Integer> randoms = Stream.generate(random::nextInt);
        randoms.filter(n -> n>0)
                .distinct()
                .limit(10)
                .forEach(System.out::println);

        //Get empolyee with longest name
        employeeList.stream()
                .reduce((a,b) -> {
                    if(a.getName().length()>b.getName().length()) return a;
                    else return b;
                }).ifPresent(e-> System.out.println(e.getName()));

        //flatmap unwraps stream, applies f, concatenates resulting streams
        employeeList.stream()
                .flatMap(employee -> Stream.of(employee.getName()));

        //Meaningful example, return all distinct words from a set of books
        /*
        * Set<Book> = lib =
        * lib.stream()
        *   .flatmap(book -> book.getWords.stream())
        *   .distinct()
        *   .foreach(System.out::println)
        * */



    }

}
