package Code;

import java.io.Serializable;

public class IssuedBook implements Serializable {
    private Book book;
    private Member member;
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
