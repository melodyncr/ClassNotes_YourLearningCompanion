import java.security.KeyStore;
import java.util.ArrayList;
import java.util.List;

/**
 * Name: Melody Neely
 * Date: 2/10/23
 * Explanation:
 * This class ( Reader) is part 1 of the project . To begin, we
 * have these elements of a book such as card number, name , phone
 * book_count, and book start.
 * */
public class Reader {
    public static final Integer CARD_NUMBER_  = 0;
    public static final Integer NAME_ = 1;
    public static final Integer PHONE_ = 2;
    public static final Integer BOOK_COUNT_ = 3;
    public static final Integer BOOK_START_ = 4;

    private Integer getCardNumber;
    private String name;
    private String phone;
    private List<Book> books = new ArrayList<>();

    public Reader(Integer getCardNumber, String name, String phone) {
        this.getCardNumber = getCardNumber;
        this.name = name;
        this.phone = phone;
        this.books = new ArrayList<>();
    }
    //returns an already checked out error book
    public Code addBook(Book book){
        if (!hasBook(book)) {
            books.add(book);
            return Code.SUCCESS;
        } else {
            return Code.BOOK_ALREADY_CHECKED_OUT_ERROR;
        }
    }
//Removes and return success. If not contained then it'll code
//    a doesn't have book error
    public Code removeBook(Book book){
        if (!hasBook(book)){
            return Code.READER_DOESNT_HAVE_BOOK_ERROR;
        }
//Try Catch because better safe than sorry when removing a book/file
        try{
           books.remove(book);
        }catch(Exception e){
            return Code.READER_COULD_NOT_REMOVE_BOOK_ERROR;
        }

        return Code.SUCCESS;
    }

//Does the user have a book? returns true if they do.
    public boolean hasBook(Book book) {
        for (Book bo : books) {
            if (bo.equals(book)) {
                return true;
            }
        }
        return false;

    }

    public int getBookCount(){

        return books.size();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public int getGetCardNumber() {
        return getCardNumber;
    }

    public void setGetCardNumber(int getCardNumber) {
        this.getCardNumber = getCardNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reader reader = (Reader) o;

        if (getGetCardNumber() != reader.getGetCardNumber()) return false;
        if (getName() != null ? !getName().equals(reader.getName()) : reader.getName() != null) return false;
        return getPhone() != null ? getPhone().equals(reader.getPhone()) : reader.getPhone() == null;
    }

    @Override
    public int hashCode() {
        int result = getGetCardNumber();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getPhone() != null ? getPhone().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return
                name + "(#"+getCardNumber+
                ") has checked out {" + books + "}";
    }
}
