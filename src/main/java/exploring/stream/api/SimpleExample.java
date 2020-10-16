package exploring.stream.api;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleExample {
    public static void main(String[] args){

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(18);
        numbers.add(10);
        numbers.add(24);
        numbers.add(17);
        numbers.add(5);

        System.out.println("Original List: " + numbers);

        //Obtain a Stream to the numbers ArrayList
        Stream<Integer> numbersStream = numbers.stream();

        //Obtain min and max value by use of min(), max(), isPresent() and get()
        //min and max are terminal operations
        Optional<Integer> minVal = numbersStream.min(Integer::compare);
        minVal.ifPresent(integer -> System.out.println("Min value: " + integer));

        //after min the stream is consumed and needs to be reopened as min is a terminal operation
        numbersStream=numbers.stream();
        Optional<Integer> maxVal = numbersStream.max(Integer::compare);
        if(maxVal.isPresent()) System.out.println("Max value: "+ maxVal.get());

        //sort the stream by using sorted()
        //sorted is intermediate operations returns a new stream
        Stream<Integer> sortedStream = numbers.stream().sorted();

        //display the stream using forEach()
        System.out.println("sorted stream: ");
        sortedStream.forEach((n)->System.out.print(n+" "));
        System.out.println();

        //display odd values using filter()
        Stream<Integer> oddVals = numbers.stream().filter((n)->(n%2)==1);

        //display the stream using forEach()
        System.out.println("odd numbers stream: ");
        oddVals.forEach((n)->System.out.print(n+" "));
        System.out.println();

        //display odd values that are greater than 5
        //two filters are pipelined
        // then collect the stream to an Array list
        ArrayList<Integer> oddLargerThanFivenumbers = numbers.stream()
                .filter((n)->(n%2==1))
                .filter((n)->n>5)
                .collect(Collectors.toCollection(ArrayList::new))
        ;
        System.out.println("Odd numbers larger than 5 List: " + oddLargerThanFivenumbers);

        //COUNT THE ELMENTS USING [long count()]
        System.out.println(
                "number of elements:"+
                numbers.stream().count()
        );

    }
}
