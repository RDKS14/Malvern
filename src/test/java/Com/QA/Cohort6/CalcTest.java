package Com.QA.Cohort6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CalcTest {

    @Test
    void testAdd1And1() {
     Assertions.assertEquals(8, Calc.add(3, 5));
    }


    @Test
    void testSubtract1And1() {
        Assertions.assertEquals(4, Calc.subtract(9, 5));
    }

    @Test
    void testDivide1And1() {
        Assertions.assertEquals(4, Calc.divide(8, 2));
    }

    @Test
    void testMultiply1And1() {
        Assertions.assertEquals(4, Calc.multiply(2, 2));
    }
}
