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

}
