import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
class ReaderTest {
    //1,Drew Clinkenbeard,831-582-4007,2,42-w-87,2020-10-12,1337,2020-11-1
    private final int testCardNumber  =  1;
    private final String testName = "Drew Clinkenbeard";
    private final String testPhone = "831-582-4007";
    private final int testBookCount = 2;
    Reader testReader = null;

    Book book = new Book("5297", "Count of Monte Cristo","Adventure",999,"Alexandre Dumas", LocalDate.now());

    @BeforeAll
    static void mainSetUp(){
        System.out.println("Main setup. Runs before all.");

    }

    @AfterAll
    static void mainTearDown(){

        System.out.println("Main tear down. Runs once at the end.");

    }

    @BeforeEach
    void setUp() {
//        Create a new reader
        System.out.println("Before each test");
        testReader = new Reader(testCardNumber, testName,testPhone);
    }

    @AfterEach
    void tearDown() {
        System.out.println("tear down test");
    }

    @Test
    void addBook() {
        System.out.println("add Book test");
        assertEquals(testReader.addBook(book),Code.SUCCESS);
        assertNotEquals(testReader.addBook(book),Code.SUCCESS);
        assertEquals(testReader.addBook(book),Code.BOOK_ALREADY_CHECKED_OUT_ERROR);

    }

    @Test
    void removeBook() {
        System.out.println("remove book Test");
        assertEquals(testReader.removeBook(book),Code.READER_DOESNT_HAVE_BOOK_ERROR);
        testReader.addBook(book);
        assertEquals(testReader.removeBook(book),Code.SUCCESS);


    }


    @Test
    void hasBook() {
        assertFalse(testReader.hasBook(book));
        testReader.addBook(book);
        assertTrue(testReader.hasBook(book));
    }

    @Test
    void getBookCount() {
        assertEquals(testReader.getBookCount(),0);
        testReader.addBook(book);
        assertEquals(testReader.getBookCount(),1);
        testReader.removeBook(book);
        assertEquals(testReader.getBookCount(),0);
    }

}