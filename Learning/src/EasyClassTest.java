import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EasyClassTest {

    private String name;
    private int count;
    private double score;

    EasyClass EasyClassTest = null;

    @BeforeEach
    void setUp() {
        System.out.println("Before each");
        name = "Melody";
        count = 1;
        score = 1.0;

       EasyClassTest = new EasyClass("Melody",1,1.0);
    }

    @AfterEach
    void tearDown() {
        System.out.println("After each");
        name = "null";
        count = 0;
        score = 0.0;
        EasyClassTest = null;
    }

    @Test
    void getName() {
        System.out.println("get Name Test");
        assertEquals(name,EasyClassTest.getName());
    }

    @Test
    void setName() {
        System.out.println( "set Name Test");
        EasyClassTest.setName("Mel");
        assertNotEquals("Melody",EasyClassTest);
        assertEquals("Mel", EasyClassTest.getName());
    }

    @Test
    void getCount() {
        System.out.println("get Count Test");
        assertEquals(1,EasyClassTest.getCount());
    }

    @Test
    void setCount() {
        System.out.println("set Count Test");
        EasyClassTest.setCount(2);
        assertNotEquals(1,EasyClassTest);
        assertEquals(2, EasyClassTest.getCount());
    }

    @Test
    void getScore() {
        System.out.println("get Score Test");
        assertEquals(1.0,EasyClassTest.getScore());
    }

    @Test
    void setScore() {
        System.out.println("set Score Test");
        EasyClassTest.setScore(2.0);
        assertNotEquals(1.0,EasyClassTest);
        assertEquals(2.0, EasyClassTest.getScore());

    }
}