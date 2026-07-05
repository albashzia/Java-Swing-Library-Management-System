package Code;

import java.util.ArrayList;

public class ArrayListsManager {

    public static ArrayListsManager instance = new ArrayListsManager();
    ArrayList<Book> bookArrayList;
    ArrayList<Member> memberArrayList;

    public ArrayListsManager(){
        bookArrayList = new ArrayList<>();
        memberArrayList = new ArrayList<>();
    }

    public boolean addBook(Book book){
        Boolean success = true;
        bookArrayList.add(book);
        return success;
    }


    public void removeBookById(Book book) {
        bookArrayList.remove(book);
    }

    // Fetching data, returning array lists for DisplayBookFrame class
    public ArrayList<Book> returnBooksArrayList(){
        return bookArrayList;
    }

    public void addMember(Member member){
        memberArrayList.add(member);
    }

    // Fetching data, returning array lists for DisplayMembersFrame class
    public ArrayList<Member> returnMembersArrayList(){
        return memberArrayList;
    }
}
