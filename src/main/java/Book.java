import java.time.LocalDate;
import java.util.Objects;

/**
 * Name: Katie Smith
 * Date: 9/20/25
 * Description:
 */

public class Book {
    public static final int AUTHOR_ = 4;
    public static final int DUE_DATE_ = 5;
    public static final int ISBN_ = 0;
    public static final int PAGE_COUNT_ = 3;
    public static final int SUBJECT_ = 2;
    public static final int TITLE_ = 1;

    private String author;
    private LocalDate dueDate;
    private String isbn;
    private int pageCount;
    private String subject;
    private String title;


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getISBN() {
        return isbn;
    }

    public void setISBN(String isbn) {
        this.isbn = isbn;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
