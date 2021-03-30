package za.ac.cput.assignment;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;




/**
 * Author: Marchello Carolus 218234457
 *
 */
public class RecordLabelTest
{
    private RecordLabel artist1;
    private RecordLabel artist2;
    private RecordLabel artist3;
    private RecordLabel artist4;


    @BeforeEach
    void setUp() {
        artist1 = new RecordLabel();
        artist2 = new RecordLabel();
        artist3 = artist1;
        artist4 = new RecordLabel();

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
