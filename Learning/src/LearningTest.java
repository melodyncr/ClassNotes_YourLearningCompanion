import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;

class LearningTest {
    Learning LearningTest = null;

    @BeforeEach
    void setUp() {
        System.out.println("Before each");
        LearningTest = new Learning();
        /*
            name = "Melody";
            count = 1;
            friends = new ArrayList<>();
         */
    }

    @AfterEach
    void tearDown() {
        System.out.println("After each");
    }

    @Test
    void getCount() {
        System.out.println("getCount Test");
        assertEquals(1,LearningTest.getCount());
        assertNotEquals(2,LearningTest.getCount());
    }

    @Test
    void setCount() {
        System.out.println("setCount Test");
        assertEquals(1,LearningTest.getCount());
        LearningTest.setCount(42);
        assertNotEquals(1,LearningTest);
        assertEquals(42,LearningTest.getCount());
    }
    @Test
    void getName(){
        System.out.println("Get Name Test");
        assertEquals("Melody",LearningTest.getName());
    }
}