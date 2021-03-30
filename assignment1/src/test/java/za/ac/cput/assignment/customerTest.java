package za.ac.cput.assignment;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;
class customerTest {

    private customer cust1;
    private customer cust2;
    private customer cust4;

    @BeforeEach
     void setup()
    {
        cust1 = new customer();
        cust2 = new customer();
        cust4 = new customer();

        cust1 = cust4;
    }
    @Test
    void testIdentity()
    {
        assertSame(cust1, cust4);
    }

    @Test
     void testEquality()
    {
        assertEquals(cust1, cust4);

    }

    @Ignore
    @Test
    void testEqualitys()
    {
        assertEquals(cust1, cust4);

    }

    @Test
    void FailingTest()
    {
        assertSame(cust2, cust4);
    }


    @Test
    @Timeout(10)
    void timeoutCheck()
    {
        for (int i =0 ; i<100 ; i++)
            System.out.println(i);
    }
  
}