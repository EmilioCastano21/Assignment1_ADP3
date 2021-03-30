package za.ac.cput.assignment;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class PetTest {

    private Pet pet1;
    private Pet pet2;
    private Pet pet3;
    private Pet pet4;
    private Pet pet5;

    @BeforeEach
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

    @Disabled
    @Test
    public void failingTest() {
        assertSame(pet1, pet4);
    }

    @Timeout(10)
    @Test
    public void timeoutTest() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(pet1);
        }
    }
}

