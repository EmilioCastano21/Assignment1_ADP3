package za.ac.cput.assignment;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class CarsTest {
    Cars car1 = new Cars("grand cherokee","Jeep", "Red");
    Cars car2 = new Cars("911GT","Porsche","White");
    Cars car3 = new Cars("grand cherokee","Jeep", "Red");
    @Test
    public void CarTestObjectEqualityPass()
    {


        assertEquals(car1.getBrand(),car3.getBrand());//to see if both objects are equal/the same


    }
    @Test
    public void CarTestIdentityPass()
    {
        assertSame(car1.getColour(),car3.getColour()); //check to see if the same
        assertNotSame(car1.getName(),car2.getName()); //check to see if they both different
    }
    @Test
    public void CarTestObjectEqualityFail()
    {
        //the failing test
        assertEquals(car1.getName(),car2.getName());

    }
    @Timeout(10)
    @Test
    public void CarTestTimeOut()
    {   //timeout used to optimise code solutions
        assertSame(car1.getColour(),car3.getColour()); //check to see if the same
        assertNotSame(car1.getName(),car2.getName()); //check to see if they both different
    }

    @Disabled
    @Test
    public void CarTestIgnore()
    {

        //we know both objects the same from previous test so ignore this test
        assertEquals(car1.getBrand(),car3.getBrand());


    }

}