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

    public void addBook(Book book){
        bookArrayList.add(book);
    }


    public void removeBookById(String id) {
        for (int i = 0; i < bookArrayList.size(); i++) {
            if (bookArrayList.get(i).getId().equalsIgnoreCase(id)){
                bookArrayList.remove(i);
            }
        }
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
