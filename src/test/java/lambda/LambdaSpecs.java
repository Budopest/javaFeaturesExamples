package lambda;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LambdaSpecs {

    @Test
    void numberTwoIsEven(){
        NumberTester isEven;
        //type of n is not specified. Rather, its type is inferred from the context.
        // In this case, its type is inferred from the parameter type of test()
        isEven = (num) -> num%2 ==0;
        assertTrue(isEven.test(2),"Number two should be detected as even number");
    }
    @Test
    void numberIsNegative(){
        NumberTester isNegative;
        //It is also possible to explicitly specify the type of a parameter in a lambda expression.
        isNegative = (int num) -> num<0;
        assertTrue(isNegative.test(-3),"Number -3 should be found negative");
    }
}
