package Code;

import java.io.Serializable;

public class IssuedBook implements Serializable {
    Book book;
    Member member;
    private String issueDate;
}
