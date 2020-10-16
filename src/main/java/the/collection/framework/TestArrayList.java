package the.collection.framework;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {

    public static void main(String args[]){
        //Array list constructors
        ArrayList<Integer> numbers = new ArrayList<>();
        // add elements to the list
        numbers.add(5);
        numbers.add(11);
        // use numbers to initialize the new list
        ArrayList<Integer> moreNumbers = new ArrayList<>(numbers);
        moreNumbers.add(1995);
        // use the tostring() method to print the list content
        System.out.println(numbers);
        System.out.println(moreNumbers);
        // use iterator with collections
        printIntCollection(moreNumbers.iterator());
        //specify initial capacity for the list
        ArrayList<Integer> extraNumbers = new ArrayList<>(50);
        // get size of each list
        System.out.println(
                "numbers size " + numbers.size() + "\n" +
                        "moreNumbers size " + moreNumbers.size() + "\n" +
                        "extraNubers size " + extraNumbers.size()
        );
        //get the number at index 0
        System.out.println("number at index 0"+numbers.get(0));
        // remove element by index
        numbers.remove(0);
        System.out.println(numbers);
        //remove element 1995 by finding its index
        moreNumbers.remove(moreNumbers.indexOf(1995));
        //remove element by value (value must be object if integer is entered it will be considered index)
        moreNumbers.remove(Integer.valueOf(11));
        System.out.println(moreNumbers);
        //ensure capacity of the arraylist
        numbers.ensureCapacity(50);
        //trim the array to its size
        numbers.trimToSize();
        //convert to array <T>T[]toArray(T array[]) returns array of typr T
        Integer numbersArray[] = new Integer[numbers.size()];
        numbersArray = numbers.toArray(numbersArray);
        System.out.println(numbersArray[0]);
        // toArray() returns array of objects
        Object anotherNumbersArray[] = new Object[numbers.size()];
        anotherNumbersArray = numbers.toArray();
        System.out.println((Integer) numbersArray[0]);

    }
    //use iterator to loop over the collection
    public static void printIntCollection(Iterator<Integer> iterator){
        System.out.println("[");
        while (iterator.hasNext())
            System.out.println(iterator.next());

        System.out.println("]");
    }




}
