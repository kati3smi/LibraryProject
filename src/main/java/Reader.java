import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Name: Katie Smith
 * Date: 9/20/25
 * Description:
 */

public class Reader {
    public static final int CARD_NUMBER_ = 0;
    public static final int NAME_ = 1;
    public static final int PHONE_ = 2;
    public static final int BOOK_COUNT_ = 3;
    public static final int BOOK_START_ = 4;

    private int cardNumber;
    private String name;
    private String phone;
    private List<Book> books;

    public Reader(int cardNumber, String name, String phone) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.phone = phone;
        books = new ArrayList<>();
    }

    public Code addBook(Book book) {
        if(books.contains(book)) {
            return Code.BOOK_ALREADY_CHECKED_OUT_ERROR;
        }
        books.add(book);
        return Code.SUCCESS;
    }

    public Code removeBook(Book book) {
        if(!books.contains(book)) {
            return Code.READER_DOESNT_HAVE_BOOK_ERROR;
        }
        books.remove(book);
        if(books.contains(book)) {
            return Code.READER_COULD_NOT_REMOVE_BOOK_ERROR;
        }
        return Code.SUCCESS;
    }

    public boolean hasBook(Book book) {
        return books.contains(book);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Reader reader = (Reader) o;
        return cardNumber == reader.cardNumber && Objects.equals(name, reader.name) && Objects.equals(phone, reader.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber, name, phone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Book book : books) {
            sb.append(book.getTitle()).append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        return name + " (#" + cardNumber + ") has checked out " + sb.toString();
    }
}
