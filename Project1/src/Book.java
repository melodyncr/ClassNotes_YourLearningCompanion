import java.time.LocalDate;

/**
 * Name: Melody Neely
 * Date: 2/5/23
 * Explanation:
 * This class ( Book) is part 1 of the project . To begin, we
 * have these elements of a book such as isbn, title, subject
 * pageCount, author , DueDate. This says a lot of what we are
 * going to be testing i our BookTest.Java expectation such as
 * an expected title.
 *
 * */

public class Book {
    public static final int ISBN_ = 0;
    public static final int TITLE_ = 1;
    public static final int SUBJECT_= 2;
    public static final int PAGE_COUNT = 3;
    public static final int  AUTHOR_ = 4;
    public static final int DUE_DATE_ = 5;

    private final String isbn;
    private final String title;
    private final String subject;
    private final int pageCount;
    private final String author;
    private final LocalDate dueDate;

    public Book(String isbn, String title,
                String subject, int pageCount,
                String author, LocalDate dueDate) {
        this.isbn = isbn;
        this.title = title;
        this.subject = subject;
        this.pageCount = pageCount;
        this.author = author;
        this.dueDate = dueDate;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getSubject() {
        return subject;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (getPageCount() != book.getPageCount()) return false;
        if (getIsbn() != null ? !getIsbn().equals(book.getIsbn()) : book.getIsbn() != null) return false;
        if (getTitle() != null ? !getTitle().equals(book.getTitle()) : book.getTitle() != null) return false;
        if (getSubject() != null ? !getSubject().equals(book.getSubject()) : book.getSubject() != null) return false;
        return getAuthor() != null ? getAuthor().equals(book.getAuthor()) : book.getAuthor() == null;
    }

    @Override
    public int hashCode() {
        int result = getIsbn() != null ? getIsbn().hashCode() : 0;
        result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
        result = 31 * result + (getSubject() != null ? getSubject().hashCode() : 0);
        result = 31 * result + getPageCount();
        result = 31 * result + (getAuthor() != null ? getAuthor().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return
                title + " by " + author + " ISBN: " + isbn;
    }
}
