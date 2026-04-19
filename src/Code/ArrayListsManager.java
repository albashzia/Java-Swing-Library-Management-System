package Code;

import java.util.ArrayList;

public class ArrayListsManager {
    ArrayList<Integer> bookIds;
    ArrayList<String> bookTitles;
    ArrayList<String> bookAuthors;
    ArrayList<Integer> booksQuantity;

    public ArrayListsManager(){
        bookIds = new ArrayList<Integer>();
        bookTitles = new ArrayList<String>();
        bookAuthors = new ArrayList<String>();
        booksQuantity = new ArrayList<Integer>();
    }

    public void addBook(int id, String title, String author, int quantity){
        bookIds.add(id);
        bookTitles.add(title);
        bookAuthors.add(author);
        booksQuantity.add(quantity);
    }
}
