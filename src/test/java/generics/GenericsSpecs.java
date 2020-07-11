package generics;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

}
