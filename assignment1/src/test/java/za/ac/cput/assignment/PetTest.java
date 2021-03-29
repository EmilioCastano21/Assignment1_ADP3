package za.ac.cput.assignment;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class PetTest {

    private Pet pet1;
    private Pet pet2;
    private Pet pet3;
    private Pet pet4;
    private Pet pet5;

    @Before
    public void setUp() {
        pet1 = new Pet();
        pet2 = new Pet();
        pet3 = pet1;
        pet4 = new Pet();
        pet5 = pet4;
    }

    @Test
    public void testIdentity() {
        assertSame(pet1, pet3);
    }

    @Test
    public void testEquality() {
        assertEquals(pet4, pet5);
    }

    @Test
    public void failingTest() {
        assertSame(pet1, pet4);
    }

    @Ignore
    @Test(timeout = 10)
    public void timeoutTest() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(pet1);
        }
    }
}
