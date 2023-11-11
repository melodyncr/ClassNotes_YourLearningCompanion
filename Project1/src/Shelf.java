import java.util.HashMap;
import java.util.Objects;

public class Shelf {
    public static Integer  SHELF_NUMBER_ = 0;
    public static Integer SUBJECT_ = 1;
    private Integer shelfNumber ;
    private String subject;

    //displays how many copies of books are available
    //in the shelf.
    private HashMap<Book,Integer> books;

//    CONSTRUCTOR
    public Shelf() {
        this.books = new HashMap<>();
        this.subject =" ";
        this.shelfNumber = 0;

    }
//    ADD BOOK
    public Code addBook(Book book){
//        Adds the parameter 'book' to the HashMap of books stored on the shelf
//        If the book already exists in the HashMap, the count should be incremented,
//        and a SUCCESS code should be returned.
        if(books.containsKey(book)){
            Integer total = books.get(book);
            total++;
            books.put(book,total);
            return Code.SUCCESS;
        }
//        If the book does NOT exist on the shelf, and the subject matches, add the book
//        to the shelf, set the count of the book to 1, and return a SUCCESS Code.
        else if (subject.equals(book.getSubject())) {
            books.put(book, 1);
            System.out.println(book.toString() + " added to shelf " + this.toString());
            return Code.SUCCESS;
        }
        //If the book does NOT exist on the shelf, and the subject DOES NOT match, return
        //a SHELF_SUBJECT_MISMATCH_ERROR Code.
        else{
            return Code.SHELF_SUBJECT_MISMATCH_ERROR;
        }
//        If the book does NOT exist on the shelf, and the subject DOES NOT match, return
//        a SHELF_SUBJECT_MISMATCH_ERROR Code.

//        If the book is successfully added, print a message that displays the toString for the Book, concatenated with " added to shelf " concatenated with the toString of the current Shelf


    }
//EQUALS AND HASHCODE
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shelf shelf = (Shelf) o;

        if (!Objects.equals(shelfNumber, shelf.shelfNumber)) return false;
        return Objects.equals(subject, shelf.subject);
    }

    @Override
    public int hashCode() {
        int result = shelfNumber != null ? shelfNumber.hashCode() : 0;
        result = 31 * result + (subject != null ? subject.hashCode() : 0);
        return result;
    }

    //    GETTERS AND SETTERS
    public Integer getShelfNumber() {
        return shelfNumber;
    }

    public void setShelfNumber(Integer shelfNumber) {
        this.shelfNumber = shelfNumber;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public HashMap<Book, Integer> getBooks() {
        return books;
    }

    public void setBooks(HashMap<Book, Integer> books) {
        this.books = books;
    }

    //getBookCount(Book book)
    //Create a Book, add a random number of copies (Use the Random object)
    public Integer getBookCount(Book book){
        if(books.containsKey(book)){
            return books.get(book);
        }else{
            return -1;
        }
    }
//LIST BOOKS
    public String listBooks(){
        return books.size() + " books on shelf: " + shelfNumber
                + " : " + subject + " " + books;
    }
//REMOVE BOOKS
    public Code removeBook(Book book){
        //If the parameter book is not present in the books hashMap,
        // return a BOOK_NOT_IN_INVENTORY_ERROR Code

        if(!books.containsKey(book)){
            System.out.println(book.getTitle() + " is not on shelf " + subject+ ".");
            return Code.BOOK_NOT_IN_INVENTORY_ERROR;
        }
        //If the parameter book IS present in the books hashMap but
        // has a count of 0, return a BOOK_NOT_IN_INVENTORY_ERROR Code
        else if (books.get(book) <= 0 ) {
            System.out.println("No copies of " + book.getTitle() + " remain on shelf " + subject + ".");
            return Code.BOOK_LIMIT_REACHED_ERROR;
        }
        //If the parameter book is in the books hashMap and the count is
        // greater than 0 decrement the count of books in the hashMap, return a SUCCESS Code and print a message
        else{
            Integer total = books.get(book);
            total --;
            books.put(book,total);
            System.out.println(book.getTitle() + " successfully removed from shelf " + subject+ ".");
            return Code.SUCCESS;
        }

    }

//    TO STRING
    @Override
    public String toString() {
        return shelfNumber + " : " + subject;
    }
}
