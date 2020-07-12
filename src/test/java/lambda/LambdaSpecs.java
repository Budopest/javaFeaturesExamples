package lambda;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LambdaSpecs {

    @Test
    void numberTwoIsEven(){
        NumberTester numberTester;
        numberTester = (num) -> num%2 ==0;
        assertTrue(numberTester.test(2),"Number two should be detected as even number");
    }
    @Test
    void numberIsNegative(){
        NumberTester numberTester;
        numberTester = (num) -> num<0;
        assertTrue(numberTester.test(-3),"Number -3 should be found negative");
    }
}
