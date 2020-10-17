package exploring.stream.api;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ReduceUsingParallelStream {
    public static void main(String[] args) {

        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(4.0);
        numbers.add(16.0);
        numbers.add(25.0);
        numbers.add(36.0);
        numbers.add(49.0);
        numbers.add(64.0);

        // find product of elements square root
        // using parallel stream and reduce function
        // reduce has a BiFunction accumulator
        // and a BinaryOperator combiner that combine the results
        Double productSquareRoot = numbers.parallelStream()
                .reduce(1.0,
                        (a,b) -> a * Math.sqrt(b),
                        (a,b) -> a*b
                        );
        System.out.println("product of square root of the element: "+productSquareRoot);


        //use mapping to map the stream to squareroot stream then calculate the product using reduce()
        Stream<Double>  squreRootStream = numbers.stream()
                .map(
                        (a) -> Math.sqrt(a)
                );
        System.out.println("product: "+
                squreRootStream.reduce(
                        1.0,
                        (a,b) -> a*b
                )
                );
    }
}
