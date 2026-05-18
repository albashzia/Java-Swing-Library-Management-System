package Code;

import java.io.Serializable;

public class Book implements Serializable {
    private String bookId;
    private String bookTitle;
    private String bookAuthor;
    private int quantity;

    public Book(String bookId,
                String bookTitle,
                String bookAuthor,
                int quantity)
    {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookAuthor= bookAuthor;
        this.quantity = quantity;
    }
}
