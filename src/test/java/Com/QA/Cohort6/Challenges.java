package Com.QA.Cohort6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Com.QA.Cohort6.Factorials;
import Com.QA.Cohort6.Doggy;

public class Challenges {
private final Factorials factorials = new Factorials();

    @Test
    void testFactorial(){
        Assertions.assertEquals("5", factorials.factoral(120));

    }
    @Test
    void testFactorial2(){
        Assertions.assertEquals("10", factorials.factoral(3628800));

    }
    @Test
    void testFactorial3(){
        Assertions.assertEquals("None ", factorials.factoral(13453453));

    }
//    private final Doggy places = new Doggy();
//    @Test
//
//        void testDoggy(){
//        Assertions.assertEquals("1st", places.places(1));
//    }

    private final Doggy places = new Doggy();
    @Test

    void testDoggy(){
        String output = places.places(1);
        System.out.println(output);
        Assertions.assertFalse(output.startsWith("1st"));
    }

}
