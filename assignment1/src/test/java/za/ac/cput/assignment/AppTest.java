package za.ac.cput.assignment;


import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    private App car1;
    private App car2;
    private App car3;


    @BeforeEach
    void setUp() {
        car1 = new App();
        car2 = new App();
        car3 = car1;

    }

    //Object Identity
    @Test
    void testIdentity(){
        assertSame(car1, car3);
    }
    private void assertSame(App carBrand1, App carBrand3) {
    }

    //Object Equality
    @Test
    void testEquality(){
        assertEqual(car1, car3);
    }
    private void assertEqual(App carBrand1, App carBrand3) {
    }

    //Failing test
    @Test
    void failingTest(){
        assertEqual(car1, car2);
    }

    //Disabling Test
    @Ignore
    @Test
    void testDis(){
        assertSame(car1, car2);
    }

    //Timeouts






}
