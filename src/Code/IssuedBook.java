package Code;

import java.io.Serializable;

public class IssuedBook implements Serializable {
    Book book;
    Member member;
    private String issueDate;

    IssuedBook(){
        this.book = null;
        this.member = null;
        this.issueDate = null;
    }

    IssuedBook(Book book, Member member, String issueDate){
        this.book = book;
        this.member = member;
        this.issueDate = issueDate;
    }
}
