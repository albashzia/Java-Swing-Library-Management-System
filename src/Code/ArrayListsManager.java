package Code;

import java.util.ArrayList;

public class ArrayListsManager {

    public static ArrayListsManager instance = new ArrayListsManager();
    ArrayList<Book> bookArrayList;

    ArrayList<Integer> memberIds;
    ArrayList<String> memberNames;
    ArrayList<String> memberNumbers;
    ArrayList<String> memberEmails;

    public ArrayListsManager(){
        bookArrayList = new ArrayList<>();

        memberIds = new ArrayList<Integer>();
        memberNames = new ArrayList<String>();
        memberNumbers = new ArrayList<String>();
        memberEmails = new ArrayList<String>();
    }

    public void addBook(Book book){
        bookArrayList.add(book);
    }


//    public void removeBookById(int id) {
//        for (int i = 0; i < bookIds.size(); i++) {
//            if (bookIds.get(i) == id) {
//                bookIds.remove(i);
//                bookTitles.remove(i);
//                bookAuthors.remove(i);
//                booksQuantity.remove(i);
//            }
//        }
//    }

    // Fetching data, returning array lists for DisplayBookFrame class
    public ArrayList<Book> returnBooksArrayList(){
        return bookArrayList;
    }

    public void addMember(int id, String name, String number, String email){
        memberIds.add(id);
        memberNames.add(name);
        memberNumbers.add(number);
        memberEmails.add(email);
    }

    // Fetching data, returning array lists for DisplayMembersFrame class
    public ArrayList<Integer> fetchMemberIdsData(){
        return memberIds;
    }
    public ArrayList<String> fetchMemberNamesData(){
        return memberNames;
    }
    public ArrayList<String> fetchMemberNumbersData(){
        return memberNumbers;
    }
    public ArrayList<String> fetchMemberMailsData(){
        return memberEmails;
    }
}
