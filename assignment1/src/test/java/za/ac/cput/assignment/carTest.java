package za.ac.cput.assignment;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class carTest {

    private car Car1;
    private car car2;
    private car Car3;

    @Before
    public void setup()
    {

        Car1 = new car();
        car2 = new car();
        Car3= new car();
        Car3 = Car1;

    }

    @Test
    public void testIdentity()
    {
       assertSame(Car3 , Car1);
    }


    @Ignore
    @Test
    public void FailingTest()
    {
        assertSame(Car3 , car2);
    }

    @Test
    public void testEquality()
    {
       assertEquals(Car1 , Car3);
    }

    @Test(timeout=10)
    public void timeoutCheck()
    {
        for (int i = 0 ; i<100000; i++)
        {
            System.out.println(i);

        }
    }
}