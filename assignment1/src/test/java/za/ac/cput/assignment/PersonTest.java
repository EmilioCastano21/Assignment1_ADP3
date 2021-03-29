package za.ac.cput.assignment;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

/**
 * Unit test for simple App.
 */
public class PersonTest
{
    private Person person1;
    private Person person2;
    private Person person3;
    private int num1,num2;

    @BeforeEach
    public void setUp()  {
        person1=new Person();
        person2=new Person();
        person3=person1;

        num1=10;
        num2=10;
    }

    @Test
    public void testObjectEquality(){
        assertEquals(num1,num2);
    }

    @Test
    public void testObjectIdentity(){
        assertSame(person1,person3);
    }

    @Ignore
    @Test
    public void failingTest(){
        assertSame(person1,person2);
    }

    @Timeout(10)
    @Test
    public void timeoutTest(){
        for(int i=1;i<=3;i++){
            String loop="person"+i;
            System.out.println(loop);
        }
    }
}
