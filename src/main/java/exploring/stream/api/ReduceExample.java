package exploring.stream.api;

import java.util.ArrayList;
import java.util.Optional;

public class ReduceExample {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(18);
        numbers.add(10);
        numbers.add(24);
        numbers.add(17);
        numbers.add(5);

        //get product of all values using reduce
        Optional<Integer> product = numbers.stream()
                .reduce((a,b)->a*b);
        if(product.isPresent()) System.out.println("product as Optional: " + product.get());

        int productInt = numbers.stream()
                .reduce(1,(a,b)->a*b);
        System.out.println("product as Integer: " + productInt);

        //get product of even numbers only
        int evenProduct = numbers.stream()
                .reduce(1,(a,b)->{
                    if(b%2==0) return a*b;
                    else return a;
                });
        System.out.println("Product of even numbers: "+evenProduct);

        //implement min using reduce()
        Optional<Integer> min = numbers.stream()
                .reduce((a,b)->{
            if(a<=b) return a;
            else return b;
        });
        if(min.isPresent()) System.out.println("min using reduce: "+min.get());

    }
}
