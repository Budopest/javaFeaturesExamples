package String_handler;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringPoolSpecs {

    @Test
    public void sameValuesPointToSameObjInThePool(){
        String name = "Ahmed";
        String anotherName = "Ahmed";
        assertTrue(name==anotherName,()->"both Strings are the same object in the pool");
    }
    @Test
    public void diffValuesPointTodiffObjInThePool(){
        String name = "Ahmed";
        String anotherName = "Ahmed";
        anotherName = "Mohamed";
        assertTrue(name!=anotherName,()->"each String apoint to a different object in the pool");
    }
    @Test
    public void sameValuesPointTodiffObjUsingNew(){
        String name = new String("Ahmed");
        String anotherName = new String("Ahmed");
        assertTrue(name!=anotherName,()->"both Strings are the same but should point to different objects  in the heap");
    }
    @Test
    public void sameValuesPointTodiffObjInPoolAndHeap(){
        String name = new String("Ahmed");
        String anotherName = "Ahmed";
        assertTrue(name!=anotherName,()->"both Strings are the same but should point to different objects one in the pool and one in the heap");
    }

}
