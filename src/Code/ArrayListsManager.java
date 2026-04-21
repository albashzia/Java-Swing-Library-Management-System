package Code;

import java.util.ArrayList;

public class ArrayListsManager {

    public static ArrayListsManager instance = new ArrayListsManager();
    ArrayList<Integer> bookIds;
    ArrayList<String> bookTitles;
    ArrayList<String> bookAuthors;
    ArrayList<Integer> booksQuantity;

    ArrayList<Integer> memberIds;
    ArrayList<String> memberNames;
    ArrayList<String> memberNumbers;
    ArrayList<String> memberEmails;

    public ArrayListsManager(){
        bookIds = new ArrayList<Integer>();
        bookTitles = new ArrayList<String>();
        bookAuthors = new ArrayList<String>();
        booksQuantity = new ArrayList<Integer>();

        memberIds = new ArrayList<Integer>();
        memberNames = new ArrayList<String>();
        memberNumbers = new ArrayList<String>();
        memberEmails = new ArrayList<String>();
    }

    public void addBook(int id, String title, String author, int quantity){
        bookIds.add(id);
        bookTitles.add(title);
        bookAuthors.add(author);
        booksQuantity.add(quantity);
    }

    public void displayAddedBooks(){
        for (int i = 0; i < bookIds.size();i++){
            System.out.println(bookIds.get(i));
            System.out.println(bookTitles.get(i));
            System.out.println(bookAuthors.get(i));
            System.out.println(booksQuantity.get(i));
        }
    }

    public void removeBookById(int id) {
        for (int i = 0; i < bookIds.size(); i++) {
            if (bookIds.get(i) == id) {
                bookIds.remove(i);
                bookTitles.remove(i);
                bookAuthors.remove(i);
                booksQuantity.remove(i);
            }
        }
    }

    // Fetching data, returning array lists for DisplayBookFrame class
    public ArrayList<Integer> fetchIdsData(){
        return bookIds;
    }
    public ArrayList<String> fetchTitlesData(){
        return bookTitles;
    }
    public ArrayList<String> fetchAuthorsData(){
        return bookAuthors;
    }
    public ArrayList<Integer> fetchQuantityData(){
        return booksQuantity;
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
