package za.ac.cput.assignment;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;




/**
 * Unit test for simple App.
 */
public class AppTest
{
    private App artist1;
    private App artist2;
    private App artist3;


    @BeforeEach
    void setUp() {
        artist1 = new App();
        artist2 = new App();
        artist3 = artist1;

    }

    //Object Identity
    @Test
    void testIdentity(){
        assertSame(artist1, artist3);
    }


    //Object Equality
    @Test
    void testEquality(){
        assertEquals(artist1, artist3);
    }


    //Failing test
    @Test
    void failingTest(){
        assertSame(artist1, artist3);
    }

    //Disabling Test
    @Disabled
    @Test
    void testDis(){
        assertSame(artist1, artist3);
    }

    //Timeouts
    @Test
    @Timeout(10)
    void timeoutMethod(){
        for(int i = 0; i < 20; i++){
            System.out.println(i);

        };


    }

}
