package generics;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GenericsSpecs {

    @Test
    public void objectIsIntegerWhenGenericIntegerUsed()
    {
        Gen<Integer> integerGen = new Gen<>(100);
        assertEquals(integerGen.getObjectType(),"java.lang.Integer");
    }
    @Test
    @DisplayName("Average of 1,2,3 should be 2")
    public void avergeInDouble(){
        BoundGenericExample<Integer> intGeneric = new BoundGenericExample<>(1,2,3);
        assertEquals((1+2+3)/3,intGeneric.getAverageinDouble(),()-> "Average should be 2.0");
    }
    @Test
    @DisplayName("Average shoild be 0 if no argument is provided")
    public void avergeInDoubleNoNumbers(){
        BoundGenericExample<Integer> intGeneric = new BoundGenericExample<>();
        assertEquals(0,intGeneric.getAverageinDouble(),()-> "Average should be 0 ");
    }
    @Test
    public void averageOfDoubleAndIntAEmptyArraysAreTheSame(){
        WildCardGenericExample<Integer> intArray = new WildCardGenericExample<>();
        WildCardGenericExample<Double> doubleArray = new WildCardGenericExample<Double>();
        assertTrue(intArray.isSameAverage(doubleArray),()->"Average of both empty arrays should be the same =0");
    }
    @Test
    public void averageOfDoubleAndIntAArraysAreTheSame(){
        WildCardGenericExample<Integer> intArray = new WildCardGenericExample<>(1,3,5);
        WildCardGenericExample<Double> doubleArray = new WildCardGenericExample<Double>(3.5,2.5,3.0);
        assertTrue(intArray.isSameAverage(doubleArray),()->"Average of both arrays should be the same");
    }
    @Test
    public void numberIsInTheArray(){
        int number = 5;
        Integer[] numbers = {5,6,7,14,4};
        assertTrue(new GeniricMethodExample().isInArray(number,numbers),()->"number 5 should be in the array");

    }
    @Test
    public void stringIsnotInTheArray(){
        String name = "Mohamed";
        String[] names = {"Abdo","Ahmed","Rana","Radwa"};
        assertTrue(!new GeniricMethodExample().isInArray(name,names),()->"name mohamed isnot in the array");

    }

}
