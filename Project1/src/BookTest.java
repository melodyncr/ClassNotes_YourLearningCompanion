import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    //1337,Headfirst Java,education,1337,Grady Booch,0000
    private final String testISBN = "1337";
    private final String testTitle = "Headfirst Java";
    private final String testSubject = "education";
    private final int testPageCount = 1337;
    private final String testAuthor = "Grady Booch";
    private final LocalDate testDueDate = LocalDate.now();

    private Book testBook = null;
    @BeforeAll
    static void mainSetUp(){
        System.out.println("Main setup. Runs before all.");

    }

    @AfterAll
    static void mainTearDown(){

        System.out.println("Main tear down. Runs once at the end.");
        //testISBN = null;
        //should I have asserted in the main set up to null it after?

    }


    @BeforeEach
    void setUp() {
        System.out.println("Before Each test");
        testBook = new Book(testISBN,testTitle,testSubject,
                testPageCount,testAuthor,testDueDate);
    }

    @AfterEach
    void tearDown() {
        System.out.println("After Each test");
        testBook = null;
    }

    @Test
    void testConstructor(){
        Book testBook2 = null;
        assertNull(testBook2);
        testBook2 = testBook;
        assertNotNull(testBook2);
        assertEquals(testBook2, testBook);
    }


    @Test
    void getIsbn() {
        System.out.println("getIsbn");
    }

    @Test
    void getTitle() {
        System.out.println("getTitle");
    }

    @Test
    void getSubject() {
        System.out.println("getSubject");
    }

    @Test
    void getPageCount() {
        System.out.println("getPageCount");
    }

    @Test
    void getAuthor() {
        System.out.println("getAuthor");
    }

    @Test
    void getDueDate() {
        System.out.println("getDueDate");
    }

    @Test
    void testEquals() {
        System.out.println("testEquals");
    }

    @Test
    void testHashCode() {
        System.out.println("testHashCode");
    }

    @Test
    void testToString() {
        System.out.println("testToString");
    }
}